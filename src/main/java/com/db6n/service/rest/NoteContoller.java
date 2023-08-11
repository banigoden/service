package com.db6n.service.rest;

import com.db6n.service.model.entity.NoteEntity;
import com.db6n.service.model.entity.UserEntity;
import com.db6n.service.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/users/{userId}/notes")
public class NoteContoller {
    private final NoteService noteService;

    @Autowired
    public NoteContoller(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping
    public NoteEntity createNote(@PathVariable Long userId, @RequestBody NoteEntity note) {
        note.setOwner(userId.toString()); // Assuming owner is the userId
        return noteService.createNote(note);
    }
    @GetMapping("/{noteId}")
    public Optional<NoteEntity> getNote(@PathVariable("noteId") Long noteId) {
        return noteService.getNoteById(noteId);
    }

    @PutMapping("/{noteId}")
    private NoteEntity updateNote(@PathVariable Long noteId, @RequestBody NoteEntity note){
       note.setNodeId(noteId);
       return noteService.createNote(note);
    }
}

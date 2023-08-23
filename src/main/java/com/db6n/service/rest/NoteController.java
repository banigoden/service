package com.db6n.service.rest;

import com.db6n.service.model.domain.User;
import com.db6n.service.model.entity.NoteEntity;
import com.db6n.service.model.web.NoteRequest;
import com.db6n.service.model.web.NoteResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/users/{userId}/notes")
public class NoteContoller {

    @PostMapping
    public ResponseEntity<NoteResponse> doGetNote(@PathVariable Long userId, @RequestBody NoteRequest request) {
        UserDto currentUser = userService.find(userId);
        if (currentUser)

        NoteDto noteDto = noteService.convertRequest(request);
        noteService.saveNote(currentUser, noteDto);
        NoteResponse noteResponse = noteService.convertDto(noteDto);
        return ResponseEntity.created(null).body(noteResponse).build();
    }
    @GetMapping("/{noteId}")
    public Optional<NoteEntity> getNote(@PathVariable("noteId") Long noteId) {
        return noteService.getNoteById(noteId);
    }

    @PutMapping("/{noteId}")
    private NoteEntity doUpdateNote(@PathVariable Long noteId, @RequestBody NoteEntity note){
       note.setNodeId(noteId);
       return noteService.createNote(note);
    }

//    private ResponseEntity doGetNote(){
//
//    }
}

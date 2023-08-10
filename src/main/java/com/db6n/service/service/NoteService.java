package com.db6n.service.service;

import com.db6n.service.model.entity.NoteEntity;
import com.db6n.service.model.entity.UserEntity;
import com.db6n.service.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public NoteEntity createNote(NoteEntity noteEntity){
        return noteRepository.save(noteEntity);
    }

    public Optional<NoteEntity> getNoteById(Long noteId){
        return noteRepository.findById(noteId);
    }

    public List<NoteEntity> getNoteByOwner(String owner){
        return noteRepository.findByName(owner);
    }

    public void deleteNote(Long noteId){
        noteRepository.deleteById(noteId);
    }
}


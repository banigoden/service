package com.db6n.service.repository;

import com.db6n.service.model.domain.Note;
import com.db6n.service.model.entity.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<NoteEntity, Long> {

    Note findById(long noteId);
    List<NoteEntity> findByOwner(String owner);
    List<NoteEntity> findByText(String text);
}

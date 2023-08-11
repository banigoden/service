package com.db6n.service.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Entity
@Table(name = "note_entity")
public class NoteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nodeId;
    @Column(name = "owner")
    private String owner;
    @Column(name = "text")
    private String text;
}

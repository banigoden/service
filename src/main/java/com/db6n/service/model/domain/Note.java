package com.db6n.service.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Note {
    private long nodeId;
    private String owner;
    private StringBuilder text;
}

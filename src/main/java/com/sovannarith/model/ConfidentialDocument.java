package com.sovannarith.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Data
public class ConfidentialDocument {
    private Integer id;
    private String fileName;
    private String owner;
}
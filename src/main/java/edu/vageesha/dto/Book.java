package edu.vageesha.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Book {
    private String id;
    private String name;
    private String author;
    private String category;
    private Integer qty;
}

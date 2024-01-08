package com.example.bookshop.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data //cobination of getter setter hashcode equals , Id class need hash code and equal
@NoArgsConstructor
public class BookId implements Serializable {

    private int id;
    private String isbn;
}

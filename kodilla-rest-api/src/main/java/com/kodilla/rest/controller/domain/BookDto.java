package com.kodilla.rest.controller.domain;

import java.util.Objects;

public class BookDto {
    private String title;
    private String author;

    public BookDto() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookDto bookDto)) return false;
        return Objects.equals(getTitle(), bookDto.getTitle()) && Objects.equals(getAuthor(), bookDto.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAuthor());
    }

    public BookDto(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

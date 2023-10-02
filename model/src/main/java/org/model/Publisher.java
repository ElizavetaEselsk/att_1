package org.model;


import java.util.UUID;

public class Publisher {
    private UUID bookId;
    private UUID id;
    private String name;

    public Publisher() {
    }


    public Publisher(UUID bookId, UUID id, String name) {
        this.bookId = bookId;
        this.id = id;
        this.name = name;
    }

    public UUID getBookId() {
        return bookId;
    }

    public void setBookId(UUID bookId) {
        this.bookId = bookId;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "bookId=" + bookId +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


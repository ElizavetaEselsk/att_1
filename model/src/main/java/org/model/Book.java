package org.model;

import java.util.List;
import java.util.UUID;

public class Book {
//    @JsonProperty("book_id")
    private UUID bookId;
//    @JsonProperty("name")
    private String name;
//    @JsonProperty("author")
    private Author author;
//    @JsonProperty("interpreters")
    private Interpreter interpreters;
//    @JsonProperty("publisher")
    private Publisher publisher;
//    @JsonProperty("readers")
    private List<Reader> readers;


    public Book() {
    }

    public Book(UUID bookId, String name, Author author, Interpreter interpreters, Publisher publisher, List<Reader> readers) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.interpreters = interpreters;
        this.publisher = publisher;
        this.readers = readers;
    }

//    @JsonProperty("book_id")
    public UUID getBookId() {
        return bookId;
    }

//    @JsonProperty("book_id")
    public void setBookId(UUID bookId) {
        this.bookId = bookId;
    }

//    @JsonProperty("name")
    public String getName() {
        return name;
    }

//    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

//    @JsonProperty("author")
    public Author getAuthor() {
        return author;
    }

//    @JsonProperty("author")
    public void setAuthor(Author author) {
        this.author = author;
    }

//    @JsonProperty("interpreters")
    public Interpreter getInterpreters() {
        return interpreters;
    }

//    @JsonProperty("interpreters")
    public void setInterpreters(Interpreter interpreters) {
        this.interpreters = interpreters;
    }

//    @JsonProperty("publisher")
    public Publisher getPublisher() {
        return publisher;
    }

//    @JsonProperty("publisher")
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

//    @JsonProperty("readers")
    public List<Reader> getReaders() {
        return readers;
    }

//    @JsonProperty("readers")
    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", author=" + author +
                ", interpreters=" + interpreters +
                ", publisher=" + publisher +
                ", readers=" + readers +
                '}';
    }

}

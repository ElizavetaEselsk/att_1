package org.model;

import java.util.UUID;

public class Author {
    private UUID bookId;
    private UUID authorId;
    private String name;
    private int age;
    private String nativeLanguage;

    public Author() {
    }

    public Author(UUID bookId, UUID authorId, String name, int age, String nativeLanguage) {
        this.bookId = bookId;
        this.authorId = authorId;
        this.name = name;
        this.age = age;
        this.nativeLanguage = nativeLanguage;
    }

    public UUID getBookId() {
        return bookId;
    }

    public void setBookId(UUID bookId) {
        this.bookId = bookId;
    }

    public UUID getAuthorId() {
        return authorId;
    }

    public void setAuthorId(UUID authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNativeLanguage() {
        return nativeLanguage;
    }

    public void setNativeLanguage(String nativeLanguage) {
        this.nativeLanguage = nativeLanguage;
    }

    @Override
    public String toString() {
        return "Author{" +
                "bookId=" + bookId +
                ", authorId=" + authorId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", nativeLanguage=" + nativeLanguage +
                '}';
    }
}

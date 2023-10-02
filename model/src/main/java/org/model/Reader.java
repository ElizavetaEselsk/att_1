package org.model;

import java.util.UUID;

public class Reader {
    private UUID bookId;
    private UUID id;
    private String name;
    private int age;
    private String nativeLanguage;

    public Reader() {
    }

    public Reader(UUID bookId, UUID id, String name, int age, String nativeLanguage) {
        this.bookId = bookId;
        this.id = id;
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
        return "Reader{" +
                "bookId=" + bookId +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", nativeLanguage='" + nativeLanguage + '\'' +
                '}';
    }
}

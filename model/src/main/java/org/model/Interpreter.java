package org.model;


import java.util.UUID;

public class Interpreter {
    private UUID bookId;
    private UUID id;
    private String name;
    private int age;
    private String workingLanguage;

    public Interpreter() {
    }

    public Interpreter(UUID bookId, UUID id, String name, int age, String workingLanguage) {
        this.bookId = bookId;
        this.id = id;
        this.name = name;
        this.age = age;
        this.workingLanguage = workingLanguage;
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

    public String getWorkingLanguage() {
        return workingLanguage;
    }

    public void setWorkingLanguage(String workingLanguage) {
        this.workingLanguage = workingLanguage;
    }

    @Override
    public String toString() {
        return "Interpreter{" +
                "bookId=" + bookId +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", workingLanguage=" + workingLanguage +
                '}';
    }
}

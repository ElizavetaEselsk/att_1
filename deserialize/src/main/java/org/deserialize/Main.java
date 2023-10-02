package org.deserialize;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.model.Book;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Book> books = new ObjectMapper().readValue(new FileInputStream("books.json"),
                new TypeReference<List<Book>>() {});

        for (Book b : books) {
            System.out.println(b.getBookId());
            System.out.println(b.getName());
            System.out.println(b.getAuthor());
            System.out.println(b.getInterpreters());
            System.out.println(b.getPublisher());
            System.out.println(b.getReaders());
            System.out.println("____________________________");
        }
    }
}

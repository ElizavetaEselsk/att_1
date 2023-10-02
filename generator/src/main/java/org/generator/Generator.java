package org.generator;


import org.model.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Generator {
    public static List<Book> randomGenerations(int countObject) {

        Random rd = new Random();
        List<Book> books = new ArrayList<Book>();

//        List<Book> books = Stream.iterate(0, i -> i).limit(10)
//                .map(o -> new Book(UUID.randomUUID(), "Name_" + rd.nextInt(),
//                        new Author(uuidF, uuidS, "Name_" + rd.nextInt(),  20, Language.ENGLISH )).collect(Collectors.toList());

        for (int i = 0; i < countObject; i++) {

            UUID uuidB = UUID.randomUUID();
            UUID uuidA = UUID.randomUUID();
            UUID uuidI = UUID.randomUUID();
            UUID uuidP = UUID.randomUUID();
            UUID uuidR = UUID.randomUUID();

            List<Reader> readers = new ArrayList<Reader>();

            for (int j = 0; j < 3; j++) {
                Reader reader = new Reader(uuidB, uuidR, "Name_" + rd.nextInt(),
                        rd.nextInt(60) + 20, Language.values()[rd.nextInt(Language.values().length)].name());
                readers.add(reader);
            }

            Book book = new Book(uuidB, "Name_" + rd.nextInt(),
                    new Author(uuidB, uuidA, "Name_" + rd.nextInt(),
                            rd.nextInt(60) + 20, Language.values()[rd.nextInt(Language.values().length)].name()),
                    new Interpreter(uuidB, uuidI, "Name_" + rd.nextInt(),
                            rd.nextInt(60) + 20, Language.values()[rd.nextInt(Language.values().length)].name()),
                    new Publisher(uuidB, uuidP, PublisherName.values()[rd.nextInt(PublisherName.values().length)].name()),
                    readers);

            books.add(book);
        }

        return books;
    }
}

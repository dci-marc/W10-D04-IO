package org.dcistudent.maps;

import org.dcistudent.entities.Book;

import java.util.HashMap;

public class BookMap extends HashMap {
    private int id = 0;

    public BookMap() {
        super();
    }

    public void add(Book book) {
        this.put(id++, book);
    }
}

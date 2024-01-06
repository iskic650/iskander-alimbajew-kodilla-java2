package com.kodilla.patterns.prototype.library;


import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testLibraryShallowCopy() {
        //Given
        Library library = new Library("library");

        Book book1 = new Book("T1", "A1", LocalDate.of(2001,1,1));
        Book book2 = new Book("T2", "A2", LocalDate.of(2002,1,1));
        Book book3 = new Book("T3", "A3", LocalDate.of(2003,1,1));
        Book book4 = new Book("T4", "A4", LocalDate.of(2004,1,1));

        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);
        library.books.add(book4);

        //When
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("library2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Then
        assertEquals(library.books, clonedLibrary.books);
    }

    @Test
    void testLibraryDeepCopy() {
        //Given
        Library library = new Library("library");

        Book book1 = new Book("T1", "A1", LocalDate.of(2001,1,1));
        Book book2 = new Book("T2", "A2", LocalDate.of(2002,1,1));
        Book book3 = new Book("T3", "A3", LocalDate.of(2003,1,1));
        Book book4 = new Book("T4", "A4", LocalDate.of(2004,1,1));

        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);
        library.books.add(book4);

        //When
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Then
        assertEquals(library.books, deepClonedLibrary.books);
    }
}

package com.ascii274.solid.srp;

public class BookDB {

    public String saveBookDB(Book book){
        return "Book saved " + book;
    }

    public String deleteBookDB(Book book){
        return "Book deleted " + book;
    }
}

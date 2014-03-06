/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.model;

/**
 *
 * @author Alex
 */
public class Book {
    private String id;
    private String bookName;
    private String isbnNum;

    public Book(BookBuilder builder) {
        this.id = builder.id;
        this.bookName = builder.bookName;
        this.isbnNum = builder.isbnNum;
    }

    public String getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public String getIsbnNum() {
        return isbnNum;
    }
    
    public static class BookBuilder{
        private String id;
        private String bookName;
        private String isbnNum;
        
        public BookBuilder(String id) {
            this.id = id;
        }

        public BookBuilder bookName(String bookName) {
            this.bookName = bookName;
            return this;
        }

        public BookBuilder isbnNum(String isbnNum) {
            this.isbnNum = isbnNum;
            return this;
        }
        
        public BookBuilder book(Book book){
            id = book.getId();
            bookName = book.getBookName();
            isbnNum = book.getIsbnNum();
            
            return this;
        }
        
        public Book build(){
            return new Book(this);
        }       
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        return true;
    }
    
    
}

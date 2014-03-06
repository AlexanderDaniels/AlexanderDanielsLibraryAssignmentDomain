/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.model;

/**
 *
 * @author Alex
 */
public class ReturnBooks {
    private String id;
    private String bookName;
    private String isbnNum;
    
    public ReturnBooks(ReturnBooksBuilder builder) {
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
    
    public static class ReturnBooksBuilder{
        private String id;
        private String bookName;
        private String isbnNum;
        
        public ReturnBooksBuilder(String id) {
            this.id = id;
        }

        public ReturnBooksBuilder bookName(String bookName) {
            this.bookName = bookName;
            return this;
        }

        public ReturnBooksBuilder isbnNum(String isbnNum) {
            this.isbnNum = isbnNum;
            return this;
        }
        
        public ReturnBooksBuilder returnBook(ReturnBooks returnBook){
            id = returnBook.getId();
            bookName = returnBook.getBookName();
            isbnNum = returnBook.getIsbnNum();
            
            return this;
        }
        
        public ReturnBooks build(){
            return new ReturnBooks(this);
        }       
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final ReturnBooks other = (ReturnBooks) obj;
        return true;
    }
    
    
}

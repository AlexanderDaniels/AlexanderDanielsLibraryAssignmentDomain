/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.model;

/**
 *
 * @author Alex
 */
public final class BuyBooks {
    private String id;
    private String bookName;
    private double bookPrice;

    public BuyBooks(BuyBooksBuilder builder) {
        this.id = builder.id;
        this.bookName = builder.bookName;
        this.bookPrice = builder.bookPrice;
    }

    public String getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public double getBookPrice() {
        return bookPrice;
    }
    
    public static class BuyBooksBuilder{
        private String id;
        private String bookName;
        private double bookPrice;

        public BuyBooksBuilder(String id) {
            this.id = id;
        }

        public BuyBooksBuilder bookName(String bookName) {
            this.bookName = bookName;
            return this;
        }

        public BuyBooksBuilder bookPrice(double bookPrice) {
            this.bookPrice = bookPrice;
            return this;
        }
        
        public BuyBooksBuilder buyBooks(BuyBooks buyBooks){
            id = buyBooks.getId();
            bookName = buyBooks.getBookName();
            bookPrice = buyBooks.getBookPrice();
            
            return this;
        }
        
        public BuyBooks build(){
            return new BuyBooks(this);
        }        
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final BuyBooks other = (BuyBooks) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
    
}

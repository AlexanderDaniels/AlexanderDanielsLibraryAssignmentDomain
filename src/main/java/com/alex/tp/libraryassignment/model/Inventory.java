/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.model;

/**
 *
 * @author Alex
 */
public final class Inventory {
    private String id;
    private String bookName;
    private int numBook;

    public Inventory(InventoryBuilder builder) {
        this.id = builder.id;
        this.bookName = builder.bookName;
        this.numBook = builder.numBook;
    }

    public String getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public int getNumBook() {
        return numBook;
    }
    
    public static class InventoryBuilder{        
        private String id;
        private String bookName;
        private int numBook;

        public InventoryBuilder(String id) {
            this.id = id;
        }

        public InventoryBuilder bookName(String bookName) {
            this.bookName = bookName;
            return this;
        }

        public InventoryBuilder numBook(int numBook) {
            this.numBook = numBook;
            return this;
        }
        
        public InventoryBuilder inventory(Inventory inventory){
            id = inventory.getId();
            bookName = inventory.getBookName();
            numBook = inventory.getNumBook();
            
            return this;
        }
        
        public Inventory build(){
            return new Inventory(this);
        }
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Inventory other = (Inventory) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }    
}

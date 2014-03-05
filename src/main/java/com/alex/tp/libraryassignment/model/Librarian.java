/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.model;

import java.util.List;

/**
 *
 * @author Alex
 */
public final class Librarian {
    private String id;
    private String levelOfLiteracy;
    private List<Contact> contact;

    private Librarian(LibrarianBuilder builder) {
        this.id = builder.id;
        this.levelOfLiteracy = builder.levelOfLiteracy;
        this.contact = builder.contact;
    }

    public String getId() {
        return id;
    }

    public String getLevelOfLiteracy() {
        return levelOfLiteracy;
    }    

    public List<Contact> getContact() {
        return contact;
    }
    
    public static class LibrarianBuilder{
        private String id;
        private String levelOfLiteracy;
        private List<Contact> contact;

        public LibrarianBuilder(String id) {
            this.id = id;
        }
        
        public LibrarianBuilder levelOfLiteracy(String levelOfLiteracy) {
            this.levelOfLiteracy = levelOfLiteracy;
            return this;
        }

        public LibrarianBuilder contact(List<Contact> val) {
            this.contact = val;
            return this;
        }
        
        public LibrarianBuilder librarian(Librarian librarian){            
            id = librarian.getId();
            levelOfLiteracy= librarian.getLevelOfLiteracy();
            return this;        
        }
        
        public Librarian build(){
            return new Librarian(this);
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Librarian other = (Librarian) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}

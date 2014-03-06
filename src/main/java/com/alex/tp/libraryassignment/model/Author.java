/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.model;

/**
 *
 * @author Alex
 */
public final class Author {
    private String id;
    private String authorName;
    private String authorSurname;

    public Author(AuthorBuilder builder) {
        this.id = builder.id;
        this.authorName = builder.authorName;
        this.authorSurname = builder.authorSurname;
    }

    public String getId() {
        return id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }
    
    public static class AuthorBuilder{
     private String id;
     private String authorName;
     private String authorSurname;  

        public AuthorBuilder(String id) {
            this.id = id;
        }

        public AuthorBuilder authorName(String authorName) {
            this.authorName = authorName;
            return this;
        }

        public AuthorBuilder authorSurname(String authorSurname) {
            this.authorSurname = authorSurname;
            return this;
        }
        
        public AuthorBuilder author(Author author){
            id = author.getId();
            authorName = author.getAuthorName();
            authorSurname = author.getAuthorSurname();
            
            return this;
        }
        
        public Author build(){
            return new Author(this);
        }
     
     
        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Author other = (Author) obj;
        return true;
    }    
}

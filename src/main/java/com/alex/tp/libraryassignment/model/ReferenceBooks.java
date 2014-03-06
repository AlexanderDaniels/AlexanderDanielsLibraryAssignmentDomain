 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.model;

/**
 *
 * @author Alex
 */
public class ReferenceBooks {
    private String id;
    private String bookName;
    private String refBookype;

    public ReferenceBooks(ReferenceBooksBuilder builder) {
        this.id = builder.id;
        this.bookName = builder.bookName;
        this.refBookype = builder.refBookype;
    }

    public String getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public String getRefBookype() {
        return refBookype;
    }
    
    public static class ReferenceBooksBuilder{
        private String id;
        private String bookName;
        private String refBookype;

        public ReferenceBooksBuilder(String id) {
            this.id = id;
        }

        public ReferenceBooksBuilder bookName(String bookName) {
            this.bookName = bookName;
            return this;
        }

        public ReferenceBooksBuilder refBookype(String refBookype) {
            this.refBookype = refBookype;
            return this;
        }
        
        public ReferenceBooksBuilder referenceBooks(ReferenceBooks referenceBooks){
            id = referenceBooks.getId();
            bookName = referenceBooks.getBookName();
            refBookype = referenceBooks.getRefBookype();
            
            return this;
        }
        
        public ReferenceBooks build(){
            return new ReferenceBooks(this);
        }
        
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final ReferenceBooks other = (ReferenceBooks) obj;
        return true;
    }
    
    
}

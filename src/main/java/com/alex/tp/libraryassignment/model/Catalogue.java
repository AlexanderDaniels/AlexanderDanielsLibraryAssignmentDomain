/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.model;

/**
 *
 * @author Alex
 */
public final class Catalogue {
    private String id;
    private String type;

    public Catalogue(CatalogueBuilder builder) {
        this.id = builder.id;
        this.type = builder.type;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }
    
    public static class CatalogueBuilder{
        private String id;
        private String type;

        public CatalogueBuilder(String id) {
            this.id = id;
        }

        public CatalogueBuilder type(String type) {
            this.type = type;
            return this;
        }
        
        public CatalogueBuilder catalogue(Catalogue catalogue){
            id = catalogue.getId();
            type = catalogue.getType();
            
            return this;
        }
        
        public Catalogue build(){
            return new Catalogue(this);
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
        final Catalogue other = (Catalogue) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
    
}

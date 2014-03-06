/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.model;

/**
 *
 * @author Alex
 */
public class Magazines {
    private String id;
    private String magName;
    private int numOfPages;

    public Magazines(MagazinesBuilder builder) {
        this.id = builder.id;
        this.magName = builder.magName;
        this.numOfPages = builder.numOfPages;
    }

    public String getId() {
        return id;
    }

    public String getMagName() {
        return magName;
    }

    public int getNumOfPages() {
        return numOfPages;
    }
    
    public static class MagazinesBuilder{        
        private String id;
        private String magName;
        private int numOfPages;

        public MagazinesBuilder(String id) {
            this.id = id;
        }

        public MagazinesBuilder magName(String magName) {
            this.magName = magName;
            return this;
        }

        public MagazinesBuilder numOfPages(int numOfPages) {
            this.numOfPages = numOfPages;
            return this;
        }
        
        public MagazinesBuilder magazines(Magazines magazines){
            id = magazines.getId();
            magName = magazines.getMagName();
            numOfPages = magazines.getNumOfPages();
            
            return this;
        }
        
        public Magazines build(){
            return new Magazines(this);
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
        final Magazines other = (Magazines) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }    
}

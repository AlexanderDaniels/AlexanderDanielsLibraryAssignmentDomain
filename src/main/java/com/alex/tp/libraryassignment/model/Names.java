/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.model;

/**
 *
 * @author Alex
 */
public final class Names {
    private String id;
    private String firstName;
    private String lastName;

    public Names(NamesBuilder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public String getId() {
        return id;
    }   

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public static class NamesBuilder{
        private String id;
        private String firstName;
        private String lastName;

        public NamesBuilder(String id) {
            this.id = id;
        }

        public NamesBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public NamesBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        
        public NamesBuilder names(Names names){
            id = names.getId();
            firstName = names.getFirstName();
            lastName = names.getLastName();
            
            return this;
        }
        
        public Names build(){
            return new Names(this);
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
        final Names other = (Names) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
    

    
}

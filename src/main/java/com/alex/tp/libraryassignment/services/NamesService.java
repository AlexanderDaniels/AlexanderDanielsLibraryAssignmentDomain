/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.services;

import com.alex.tp.libraryassignment.model.*;

/**
 *
 * @author Alex
 */
public class NamesService {
    private String id;
    private String firstName;
    private String lastName;

    public NamesService(NamesBuilder builder) {
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

    private static class NamesBuilder {
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
        
        public NamesBuilder names(NamesService names){            
            id = names.getId();
            firstName =  names.getFirstName();
            lastName =  names.getLastName();
            
            return this;        
        }
        
        public NamesService build(){
            return new NamesService(this);
        }
        
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final NamesService other = (NamesService) obj;
        return true;
    }    
}

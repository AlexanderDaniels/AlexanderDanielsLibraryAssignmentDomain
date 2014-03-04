/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.services.Impl;

import com.alex.tp.libraryassignment.services.*;
import com.alex.tp.libraryassignment.model.*;

/**
 *
 * @author Alex
 */
public class DemographicsServiceImpl {
    private String id;
    private String gender;
    private String race;

    public DemographicsServiceImpl(DemographicsBuilder builder) {
        this.id = builder.id;
        this.gender = builder.gender;
        this.race = builder.race;
    }

    public String getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public String getRace() {
        return race;
    }    

    private static class DemographicsBuilder {
        private String id;
        private String gender;
        private String race;
    
        public DemographicsBuilder(String id) {
            this.id = id;
        }

        public DemographicsBuilder gender() {
            this.gender = gender;
            return this;
        }

        public DemographicsBuilder race() {
            this.race = race;
            return this;
        }
        
        public DemographicsBuilder demographics(DemographicsServiceImpl demo)
        {
            id = demo.getId();
            gender = demo.getGender();
            race = demo.getRace();
            
            return this;
        }
        
        public DemographicsServiceImpl build(){
            return new DemographicsServiceImpl(this);
        }    
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final DemographicsServiceImpl other = (DemographicsServiceImpl) obj;
        return true;
    }        
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.model;

/**
 *
 * @author Alex
 */
public final class Demographics {
    private String id;
    private String gender;
    private String race;

    public Demographics(DemographicsBuilder builder) {
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
    
    public static class DemographicsBuilder{
        private String id;
        private String gender;
        private String race;

        public DemographicsBuilder(String id) {
            this.id = id;
        }

        public DemographicsBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public DemographicsBuilder race(String race) {
            this.race = race;
            return this;
        }
        
        public DemographicsBuilder demographics(Demographics demographics){
            id = demographics.getId();
            gender = demographics.getGender();
            race = demographics.getRace();
            
            return this;
        }
        
        public Demographics build(){
            return new Demographics(this);
        }        
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Demographics other = (Demographics) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }   
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.model;

/**
 *
 * @author Alex
 */
public final class Journals {
    private String id;
    private String journalName;
    private int numOfPages;

    public Journals(JournalsBuilder builder) {
        this.id = builder.id;
        this.journalName = builder.journalName;
        this.numOfPages = builder.numOfPages;
    }

    public String getId() {
        return id;
    }

    public String getJournalName() {
        return journalName;
    }

    public int getNumOfPages() {
        return numOfPages;
    }
    
    public static class JournalsBuilder{
        private String id;
        private String journalName;
        private int numOfPages;

        public JournalsBuilder(String id) {
            this.id = id;
        }

        public JournalsBuilder journalName(String journalName) {
            this.journalName = journalName;
            return this;
        }

        public JournalsBuilder numOfPages(int numOfPages) {
            this.numOfPages = numOfPages;
            return this;
        }
        
        public JournalsBuilder journals(Journals journals){
            id = journals.getId();
            journalName = journals.getJournalName();
            numOfPages = journals.getNumOfPages();
            
            return this;
        }
        
        public Journals build(){
            return new Journals(this);
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
        final Journals other = (Journals) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }    
}

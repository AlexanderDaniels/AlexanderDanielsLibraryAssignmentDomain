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
public class LibraryMembers {
    private String id;
    private String membershipNum;
    private List<Contact> contact;

    private LibraryMembers(LibraryMembersBuilder builder) {
        this.id = builder.id;
        this.membershipNum = builder.membershipNum;
        this.contact = builder.contact;
    }

    public String getId() {
        return id;
    }

    public String getMembershipNum() {
        return membershipNum;
    }    

    public List<Contact> getContact() {
        return contact;
    }
    
    public static class LibraryMembersBuilder{
        private String id;
        private String membershipNum;
        private List<Contact> contact;

        public LibraryMembersBuilder(String id) {
            this.id = id;
        }
        
        public LibraryMembersBuilder membershipNum(String membershipNum) {
            this.membershipNum = membershipNum;
            return this;
        }

        public LibraryMembersBuilder contact(List<Contact> val) {
            this.contact = val;
            return this;
        }
        
        public LibraryMembersBuilder librarian(LibraryMembers libraryMembers){            
            id = libraryMembers.getId();
            membershipNum= libraryMembers.getMembershipNum();
            return this;        
        }
        
        public LibraryMembers build(){
            return new LibraryMembers(this);
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final LibraryMembers other = (LibraryMembers) obj;
        return true;
    }   
}

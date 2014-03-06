/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.model;

/**
 *
 * @author Alex
 */
public class LendBooks {
    private String id;
    private String membershipNum;
    private String bookName;

    public LendBooks(LendBookBuilder builder) {
        this.id = builder.id;
        this.membershipNum = builder.membershipNum;
        this.bookName = builder.bookName;
    }

    public String getId() {
        return id;
    }

    public String getMembershipNum() {
        return membershipNum;
    }

    public String getBookName() {
        return bookName;
    }
    
    public static class LendBookBuilder{       
        private String id;
        private String membershipNum;
        private String bookName;

        public LendBookBuilder(String id) {
            this.id = id;
        }

        public LendBookBuilder membershipNum(String membershipNum) {
            this.membershipNum = membershipNum;
            return this;
        }

        public LendBookBuilder bookName(String bookName) {
            this.bookName = bookName;
            return this;
        }
        
        public LendBookBuilder lendBooks(LendBooks lendBooks){
            id = lendBooks.getId();
            membershipNum = lendBooks.getMembershipNum();
            bookName = lendBooks.getBookName();
            
            return this;
        }
        
        public LendBooks build(){
            return new LendBooks(this);
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
        final LendBooks other = (LendBooks) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
    
}

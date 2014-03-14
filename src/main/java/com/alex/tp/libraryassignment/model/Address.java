/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.model;

/**
 *
 * @author Alex
 */
public final class Address {
    private String id;
    private String email;
    private String telephoneNum;
    private String cellphoneNum;

    public Address(AddressBuilder builder) {
        id = builder.id;
        email = builder.email;
        telephoneNum = builder.telephoneNum;
        cellphoneNum = builder.cellphoneNum;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephoneNum() {
        return telephoneNum;
    }

    public String getCellphoneNum() {
        return cellphoneNum;
    }
    
    public static class AddressBuilder{
        private String id;
        private String email;
        private String telephoneNum;
        private String cellphoneNum;

        public AddressBuilder(String id) {
            this.id = id;
        }

        public AddressBuilder email(String value) {
            email = value;
            return this;
        }

        public AddressBuilder telephoneNum(String value) {
            telephoneNum = value;
            return this;
        }

        public AddressBuilder cellphoneNum(String value) {
            cellphoneNum = value;
            return this;
        }
        
        public AddressBuilder address(Address address){
            id = address.getId();
            email = address.getEmail();
            telephoneNum = address.getTelephoneNum();
            cellphoneNum = address.getCellphoneNum();
            
            return this;
        }
        
        public Address build(){
            return new Address(this);
        }       
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Address other = (Address) obj;
        return true;
    }
    
    
}

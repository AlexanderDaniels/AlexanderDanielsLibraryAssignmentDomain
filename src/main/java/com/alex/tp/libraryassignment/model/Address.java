/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.model;

/**
 *
 * @author Alex
 */
public class Address {
    private String id;
    private String postalCode;
    private String postalAddress;
    private String physicalAddress;

    public Address(AddressBuilder builder) {
        this.id = builder.id;
        this.postalCode = builder.postalCode;
        this.postalAddress = builder.postalAddress;
        this.physicalAddress = builder.physicalAddress;
    }    

    public String getId() {
        return id;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    private static class AddressBuilder {
        private String id;
        private String postalCode;
        private String postalAddress;
        private String physicalAddress;
        
        public AddressBuilder(String id) {
            this.id = id;
        }

        public AddressBuilder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public AddressBuilder postalAddress(String postalAddress) {
            this.postalAddress = postalAddress;
            return this;
        }

        public AddressBuilder physicalAddress(String physicalAddress) {
            this.physicalAddress = physicalAddress;
            return this;
        }        
        
        public AddressBuilder address(Address address){            
            id = address.getId();
            postalCode =  address.getPostalCode();
            postalAddress =  address.getPostalAddress();
            physicalAddress =  address.getPhysicalAddress();
            return this;        
        }
        
        public Address build(){
            return new Address(this);
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Address other = (Address) obj;
        return true;
    }
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.model;
/**
 *
 * @author Alex
 */
public final class Contact {
    
    private String id;
    private String email;
    private String telephone;
    private String cellphone;

    public Contact(ContactBuilder builder) {
        this.id = builder.id;
        this.email = builder.email;
        this.telephone = builder.telephone;
        this.cellphone = builder.cellphone;
    }           

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getCellphone() {
        return cellphone;
    }    
    
    public static class ContactBuilder {
        private String id;
        private String email;
        private String telephone;
        private String cellphone;

        public ContactBuilder(String id) {
            this.id = id;
        }     

        public ContactBuilder email(String email) {
            this.email = email;
            return this;
        }

        public ContactBuilder telephone(String telephone) {
            this.telephone = telephone;
            return this;
        }

        public ContactBuilder cellphone(String cellphone) {
            this.cellphone = cellphone;
            return this;
        }         
        
        public ContactBuilder contact(Contact contact){            
            id = contact.getId();
            email = contact.getEmail();
            telephone = contact.getTelephone();
            cellphone = contact.getCellphone();
            return this;        
        }
        
        public Contact build(){
            return new Contact(this);
        }
   }    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Contact other = (Contact) obj;
        return true;
    }   
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.model;

/**
 *
 * @author Alex
 */
public final class Authentication {
    
    private String id;
    private String username;
    private String password;

    public Authentication(AuthenticationBuilder builder) {
        this.id = builder.id;
        this.username = builder.username;
        this.password = builder.password;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    public static class AuthenticationBuilder{
        private String id;
        private String username;
        private String password;

        public AuthenticationBuilder(String id) {
            this.id = id;
        }

        public AuthenticationBuilder username(String username) {
            this.username = username;
            return this;
        }

        public AuthenticationBuilder password(String password) {
            this.password = password;
            return this;
        }
        
        public AuthenticationBuilder authentication(Authentication authentication){
            id = authentication.getId();
            password = authentication.getPassword();
            username = authentication.getUsername();
            return this;
        } 
        
        public Authentication build(){
            return new Authentication(this);
        }
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Authentication other = (Authentication) obj;
        return true;
    }
    
    
}

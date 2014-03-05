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
    private String password;
    private String userName;

    public Authentication(AuthenticationBuilder builder) {
        this.id = builder.id;
        this.password = builder.password;
        this.userName = builder.userName;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }
    
    private static class AuthenticationBuilder {
        private String id;
        private String password;
        private String userName;
        
        public AuthenticationBuilder(String id) {
            this.id = id;
        }

        public AuthenticationBuilder password(String password) {
            this.password = password;
            return this;
        }

        public AuthenticationBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }
        
        public AuthenticationBuilder authentication(Authentication authentication){
            this.id = authentication.getId();
            this.password = authentication.getPassword();
            this.userName = authentication.getUserName();
            return this;
        }
        
        public Authentication build()
        {
            return new Authentication(this);
        }
        
        
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.id != null ? this.id.hashCode() : 0);
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

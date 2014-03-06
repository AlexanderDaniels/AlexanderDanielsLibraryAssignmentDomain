/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.model;

/**
 *
 * @author Alex
 */
public final class Publisher {
    private String id;
    private String publisherName;
    private String publisherAddress;

    public Publisher(PublisherBuilder builder) {
        this.id = builder.id;
        this.publisherName = builder.publisherName;
        this.publisherAddress = builder.publisherAddress;
    }

    public String getId() {
        return id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public String getPublisherAddress() {
        return publisherAddress;
    }
    
    public static class PublisherBuilder{
        private String id;
        private String publisherName;
        private String publisherAddress;

        public PublisherBuilder(String id) {
            this.id = id;
        }

        public PublisherBuilder pblisherName(String publisherName) {
            this.publisherName = publisherName;
            return this;
        }

        public PublisherBuilder publisherAddress(String publisherAddress) {
            this.publisherAddress = publisherAddress;
            return this;
        }
        
        public PublisherBuilder publisher(Publisher publisher){
            id = publisher.getId();
            publisherName = publisher.getPublisherName();
            publisherAddress = publisher.getPublisherAddress();
            
            return this;
        }
        
        public Publisher build(){
            return new Publisher(this);
        }
        
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Publisher other = (Publisher) obj;
        return true;
    }
    
    
}

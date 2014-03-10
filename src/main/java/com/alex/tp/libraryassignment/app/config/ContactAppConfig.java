/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.app.config;

import com.alex.tp.libraryassignment.services.crud.ContactCrudservice;
import com.alex.tp.libraryassignment.services.crud.Impl.ContactCrudServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 *
 * @author Alex
 */
@Configuration
public class ContactAppConfig {
    
    @Bean(name="contact")
    public ContactCrudservice getService(){
        return new ContactCrudServiceImpl();
    }
}

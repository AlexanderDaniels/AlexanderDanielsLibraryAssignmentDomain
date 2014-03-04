/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.app.config;

import com.alex.tp.libraryassignment.services.ContactService;
import com.alex.tp.libraryassignment.services.Impl.ContactServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 *
 * @author Alex
 */
@Configuration
public class ContactAppConfig {
    
    @Bean(name="contact")
    public ContactService getService(){
        return new ContactServiceImpl();
    }
}

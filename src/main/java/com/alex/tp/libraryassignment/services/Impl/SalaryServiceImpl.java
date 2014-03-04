/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.services.Impl;

import com.alex.tp.libraryassignment.services.*;
import com.alex.tp.libraryassignment.model.*;
import java.math.BigDecimal;

/**
 *
 * @author Alex
 */
public class SalaryServiceImpl {
    private String id;
    private BigDecimal baseSalary;

    public SalaryServiceImpl(SalaryBuilder builder) {
        this.id = builder.id;
        this.baseSalary = builder.baseSalary;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }
    
    public static class SalaryBuilder{
        private String id;
        private BigDecimal baseSalary;
        
        public SalaryBuilder(String id) {
            this.id = id;
        }

        public SalaryBuilder baseSalary(BigDecimal baseSalary) {
            this.baseSalary = baseSalary;
            return this;
        }
        
        public SalaryBuilder salary(SalaryServiceImpl salary){
            id = salary.getId();
            baseSalary = salary.getBaseSalary();
            
            return this;
        }
        
        public SalaryServiceImpl build(){
            return new SalaryServiceImpl(this);
        }        
    }    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final SalaryServiceImpl other = (SalaryServiceImpl) obj;
        return true;
    }
}

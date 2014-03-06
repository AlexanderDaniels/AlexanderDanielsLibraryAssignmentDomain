/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.model;

import java.math.BigDecimal;

/**
 *
 * @author Alex
 */
public final class Salary {
    private String id;
    private double baseSalary;

    public Salary(SalaryBuilder builder) {
        this.id = builder.id;
        this.baseSalary = builder.baseSalary;
    }

    public String getId() {
        return id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
    
    public static class SalaryBuilder{
        private String id;
        private double baseSalary;
        
        public SalaryBuilder(String id) {
            this.id = id;
        }

        public SalaryBuilder baseSalary(double baseSalary) {
            this.baseSalary = baseSalary;
            return this;
        }
        
        public SalaryBuilder salary(Salary salary){
            id = salary.getId();
            baseSalary = salary.getBaseSalary();
            
            return this;
        }
        
        public Salary build(){
            return new Salary(this);
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
        final Salary other = (Salary) obj;
        return true;
    }
}

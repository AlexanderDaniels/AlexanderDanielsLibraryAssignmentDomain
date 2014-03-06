/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.model;

/**
 *
 * @author Alex
 */
public final class CalculateFine {
    private String id;
    private int daysLate;
    private double amount;

    public CalculateFine(CalculateFineBuilder builder) {
        this.id = builder.id;
        this.daysLate = builder.daysLate;
        this.amount = builder.amount;
    }

    public String getId() {
        return id;
    }

    public int getDaysLate() {
        return daysLate;
    }

    public double getAmount() {
        return amount;
    }
    
    public static class CalculateFineBuilder{
        private String id;
        private int daysLate;
        private double amount;

        public CalculateFineBuilder(String id) {
            this.id = id;
        }

        public CalculateFineBuilder daysLate(int daysLate) {
            this.daysLate = daysLate;
            return this;
        }

        public CalculateFineBuilder amount(double amount) {
            this.amount = amount;
            return this;
        }
        
        public CalculateFineBuilder calculateFine(CalculateFine calculateFine){
            id = calculateFine.getId();
            daysLate = calculateFine.getDaysLate();
            amount = calculateFine.getAmount();
            
            return this;
        }
        
        public CalculateFine build(){
            return new CalculateFine(this);
        }
        
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final CalculateFine other = (CalculateFine) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }    
}

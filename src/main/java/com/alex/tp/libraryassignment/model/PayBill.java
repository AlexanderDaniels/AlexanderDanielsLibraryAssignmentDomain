/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.model;

/**
 *
 * @author Alex
 */
public final class PayBill {
    private String id;
    private String billNo;
    private double amount;

    public PayBill(PayBillBuilder builder) {
        this.id = builder.id;
        this.billNo = builder.billNo;
        this.amount = builder.amount;
    }

    public String getId() {
        return id;
    }

    public String getBillNo() {
        return billNo;
    }

    public double getAmount() {
        return amount;
    }
    
    public static class PayBillBuilder{
        private String id;
        private String billNo;
        private double amount;

        public PayBillBuilder(String id) {
            this.id = id;
        }

        public PayBillBuilder billNo(String billNo) {
            this.billNo = billNo;
            return this;
        }

        public PayBillBuilder amount(double amount) {
            this.amount = amount;
            return this;
        }
        
        public PayBillBuilder payBill(PayBill payBill){
            id = payBill.getId();
            billNo = payBill.getBillNo();
            amount = payBill.getAmount();
            
            return this;
        }
        
        public PayBill build(){
            return new PayBill(this);
        }       
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final PayBill other = (PayBill) obj;
        return true;
    }
    
    
}

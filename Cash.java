/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo1;

/**
 *
 * @author Carlos Ricardo
 */
public class Cash extends Payment {
    
     public int cashaten;

    public Cash(int cashaten, int amount) {
        super(amount);
        this.cashaten = cashaten;
    }

    public int getCashaten() {
        return cashaten;
    }

    public void setCashaten(int cashaten) {
        this.cashaten = cashaten;
    }

     @Override
    public int getAmount() {
        return amount;
    }

     @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }
     
}

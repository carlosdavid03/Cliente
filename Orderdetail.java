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
public class Orderdetail {
    
     public String taxstatus;
    public int quantity;
    public String name;

    public Orderdetail(String taxstatus, int quantity, String name) {
        this.taxstatus = taxstatus;
        this.quantity = quantity;
        this.name = name;
    }

    public String getTaxstatus() {
        return taxstatus;
    }

    public void setTaxstatus(String taxstatus) {
        this.taxstatus = taxstatus;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

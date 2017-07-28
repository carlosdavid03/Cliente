/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Fuller 101
 */
public class Customer {
    
    
    public String adress;
    private String name;
    public Order orden;

    public Customer(String adress, String name, Order orden) {
        this.adress = adress;
        this.name = name;
        this.orden = orden;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Order getOrden() {
        return orden;
    }

    public void setOrden(Order orden) {
        this.orden = orden;
    }

 
}

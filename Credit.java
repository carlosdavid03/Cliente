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
public class Credit extends Payment {
    
     public int number;
    public String tipo; 

    public Credit(int number, String tipo, int amount) {
        super(amount);
        this.number = number;
        this.tipo = tipo;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

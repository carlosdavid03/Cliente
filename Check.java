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
public class Check extends Payment{
    
     public String name;
    public int idbank;

    public Check(String name, int idbank, int amount) {
        super(amount);
        this.name = name;
        this.idbank = idbank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdbank() {
        return idbank;
    }

    public void setIdbank(int idbank) {
        this.idbank = idbank;
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

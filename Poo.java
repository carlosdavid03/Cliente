/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Fuller 101
 */
public class Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Item> Listatem = new ArrayList<>();
            Listatem.add(new Item("Hecho","Café"));
            Listatem.add(new Item("Hecho","Pan"));
            Listatem.add(new Item("Actualizado","Postres"));
            Listatem.add(new Item("Actualizado","Jugo"));
            Listatem.add(new Item("Hecho","Galletas"));
        
        List<Orderdetail> Listaitem = new ArrayList<>();
            Listaitem.add(new Orderdetail("Bueno",35,"Pan"));
            Listaitem.add(new Orderdetail("Excelente",27,"Café"));
            Listaitem.add(new Orderdetail("Bueno",100,"Pastel"));
            
        List<Credit> Listcredit = new ArrayList<>();
            Listcredit.add(new Credit(1001,"Tarjeta Credito",25000));
            Listcredit.add(new Credit(1012,"Tarjeta Credito",750000));
            Listcredit.add(new Credit(1035,"Efectivo",850000));
            
        List<Check> Listcheck = new ArrayList<>();
            Listcheck.add(new Check("Colpatria",998,25000));
            Listcheck.add(new Check("Bancolombia",967,750000));
            Listcheck.add(new Check("Banco Popular",924,850000));
            
        List<Cash> Listcash = new ArrayList<>();
            Listcash.add(new Cash(100000,25000));
            Listcash.add(new Cash(1000000,750000));
            Listcash.add(new Cash(2000000,850000));
            
        List<Customer> Listcustomer = new ArrayList<>();
            Listcustomer.add(new Customer("Barrio 145 # 6-14","Alberto",new(1,"Bueno","15-05-2017","123",new(100000,new()))));
            
        List<Order> Listorder = new ArrayList<>();
            Listorder.add(new Order(1,"Bueno",15/05/2017,"Alberto","123",25000));
        
   
        
    }
    
}
   
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo1;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
/**
 *
 * @author Carlos Ricardo
 */
public class Poo1 {

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
            Listcustomer.add(new Customer("Av68 #34 sur", "Alberto",new Order("Efectivo",253,"Bueno","15/05/17", new Payment(20000))));
            Listcustomer.add(new Customer("Carrera 80 #26-06", "Sofia",new Order("Tarjeta Credito",346,"Excelente","02/03/17", new Payment(50000))));
            Listcustomer.add(new Customer("Cll 72 sur #10-24", "Luis",new Order("Efectivo",112,"Bueno","30/04/17", new Payment(80000))));
    
            
        //Metodo para hallar el medio de pago con mayor monto. 
            int max = 0;
            for (Customer t: Listcustomer){
                if (t.orden.pay.amount % 2 == 0){
                    if (t.orden.pay.amount > max)
                        max = t.orden.pay.amount;
                }
            }
            System.out.println(max);

            
    }
    
}
  
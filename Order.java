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
public class Order {
    
    public String medpago;
    public int id;
    public String status;
    public String fecha;
    public Payment pay;

    public Order(String medpago, int id, String status, String fecha, Payment pay) {
        this.medpago = medpago;
        this.id = id;
        this.status = status;
        this.fecha = fecha;
        this.pay = pay;
    }

    public String getMedpago() {
        return medpago;
    }

    public void setMedpago(String medpago) {
        this.medpago = medpago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Payment getPay() {
        return pay;
    }

    public void setPay(Payment pay) {
        this.pay = pay;
    }


    
}

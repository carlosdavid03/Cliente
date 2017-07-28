/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Fuller 101
 */
public class Order {
    
    public int medpago;
    public String status;
    private Date fecha;
    public Customer name;
    public String id;
    public Payment pay;
    
    List<Orderdetail> orderdetail;
    List<Payment> payment;

    public Order(int medpago, String status, Date fecha, Customer name, String id, Payment pay, List<Orderdetail> orderdetail, List<Payment> payment) {
        this.medpago = medpago;
        this.status = status;
        this.fecha = fecha;
        this.name = name;
        this.id = id;
        this.pay = pay;
        this.orderdetail = orderdetail;
        this.payment = payment;
    }

    public int getMedpago() {
        return medpago;
    }

    public void setMedpago(int medpago) {
        this.medpago = medpago;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Customer getName() {
        return name;
    }

    public void setName(Customer name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Payment getPay() {
        return pay;
    }

    public void setPay(Payment pay) {
        this.pay = pay;
    }

    public List<Orderdetail> getOrderdetail() {
        return orderdetail;
    }

    public void setOrderdetail(List<Orderdetail> orderdetail) {
        this.orderdetail = orderdetail;
    }

    public List<Payment> getPayment() {
        return payment;
    }

    public void setPayment(List<Payment> payment) {
        this.payment = payment;
    }

    
    
}

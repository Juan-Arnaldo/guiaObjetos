package com.company;

public class cuentaBanco {
    private int id;
    private String nombre;
    private double balance;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double credito(double deposito, double balance){
        return balance + deposito;
    }

    public double debito(double sustraccion, double balance){
        if(sustraccion <= balance){
            return balance - sustraccion;
        }else {
            System.out.println("No posee en la cuenta lo que desesa gastar");
        }
        return balance;
    }

    public void mostrarCuenta(cuentaBanco c){
        System.out.println("Cuenta[id:" + c.getId() + ", Nombre:" + c.getNombre() + ", Balance:" + c.getBalance() + "]");
    }
}

package com.company;

public class empleado {

    private String nombre;
    private String apellido;
    private String dni;
    private double salario;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double salarioAnual(double salario){
        return salario * 12;
    }

    public double aumentoSalario(double salario, double aumento){
        double aux = (salario * aumento) /100;
        salario = salario + aux;
        return salario;
    }

    public void mostrarEmpleado(empleado e) {
        System.out.println("Empleado[dni:" + e.getDni() + ", Apellido:" + e.getApellido() + ", Nombre:" + e.getNombre() + ", Salario:" + e.getSalario() + "]");
    }
}

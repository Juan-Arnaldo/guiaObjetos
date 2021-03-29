package com.company;

public class rectangulo {

    private double base = 1;
    private double alto = 1;

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double ancho) {
        this.base = ancho;
    }

    public double area(){
        return base * alto;
    }

    public double perimetro(){
        return (2*base) + (2*alto);
    }

    public void mostrarBase(rectangulo r){
        System.out.println("Base :" + r.getBase());
    }

    public void mostrarAltura(rectangulo r){
        System.out.println("Altura :" + r.getAlto());
    }

    public void areaYperimetro(rectangulo r){
        System.out.println("Area: " + r.area() + "\nPerimetro: " + r.perimetro());
    }

}

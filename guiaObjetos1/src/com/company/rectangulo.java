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



}

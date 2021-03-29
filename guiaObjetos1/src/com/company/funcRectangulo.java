package com.company;

import java.util.Scanner;

public class funcRectangulo {

    public static void cargarBase(rectangulo r){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo: ");
        r.setBase(sc.nextDouble());
    }

    public static void cargarAltura(rectangulo r){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la altura del rectangulo:");
        r.setAlto(sc.nextDouble());
    }

    public static void mostrarBase(rectangulo r){
        System.out.println("Base :" + r.getBase());
    }

    public static void mostrarAltura(rectangulo r){
        System.out.println("Altura :" + r.getAlto());
    }

    public static void areaYperimetro(rectangulo r){
        System.out.println("Area: " + r.area() + "\nPerimetro: " + r.perimetro());
    }
}

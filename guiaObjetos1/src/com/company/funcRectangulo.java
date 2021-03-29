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
}

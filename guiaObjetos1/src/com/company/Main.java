package com.company;

import java.util.Scanner;

import static com.company.funcRectangulo.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opc;

        do {
            System.out.println("Ejercicio 1\nEjercicio 2\nEjercicio 3\nEjercicio 4\nEjercicio 5\nEliga el ejercicio que quiere ver: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    ejer1();
                    break;
                case 2:
                    ejer2();
                    break;
                case 3:
                    ejer3();
                    break;
                case 4:
                    ejer4();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta");
                    break;
            }
            System.out.println("Ingrese 0 si no desea ver otro ejercicio, de lo contrario ingrese cualquier numero:");
            opc = sc.nextInt();
        } while (opc != 0);
    }

    //Ejercicio N1
    public static void ejer1(){
        rectangulo r = new rectangulo();
        rectangulo r2 = new rectangulo();

        cargarBase(r);
        cargarAltura(r);
        areaYperimetro(r);

        System.out.println("Vamos a modificar los valores de base y altura nuevamente \n");

        cargarBase(r);
        cargarAltura(r);
        areaYperimetro(r);

        System.out.println("\nCreamos un nuevo rectangulo y mostramos los valores predeterminados");

        System.out.println("\nRectangulo 2 \n");
        mostrarAltura(r2);
        mostrarBase(r2);

    }

    //Ejercicio N2
    public static void ejer2(){
        empleado p = new empleado();
        empleado p2 = new empleado();

        p.setNombre("Carlos");
        p.setApellido("Gutierrez");
        p.setDni("23456345");
        p.setSalario(25000);

        p2.setNombre("Ana");
        p2.setApellido("Sanchez");
        p2.setDni("34234123");
        p2.setSalario(27500);

        p.mostrarEmpleado(p);
        p2.mostrarEmpleado(p2);

        System.out.println("\nEl salario anual del empleado Gutierrez con un aumento del 15%: " + p.salarioAnual(p.aumentoSalario(p.getSalario(), 15)));

    }

    //Ejercicio N3
    public static void ejer3(){
        itemVenta i = new itemVenta();

        i.setId(0);
        i.setDescripcion("Celular de alta gama");
        i.setCantidad(2);
        i.setPrecioUnitario(40000);

        i.mostrarItem(i);

        System.out.println("Precio Final con la compra de 2 items: " + i.precioFinal(i.getCantidad(), i.getPrecioUnitario()));

    }

    //Ejercicio N4
    public static void ejer4(){
        cuentaBanco c = new cuentaBanco();

        c.setId(1);
        c.setNombre("Prueba");
        c.setBalance(15000);

        c.setBalance(c.credito(2500, c.getBalance()));
        c.setBalance(c.debito(1500, c.getBalance()));
        c.setBalance(c.debito(30000, c.getBalance()));

        c.mostrarCuenta(c);
    }
}



package com.liceolapaz.des.acc;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        do {
            //Escribir menú
            escribirMenu();
            //Pedir opción
            pedirOpcion();
            //leer opción y guardarla
            int opcion = leerOpcion();
            //
            switch (opcion) {
                case 0:
                    System.out.println("Usted ha decidido salir, Hasta la próxima.");
                    System.exit(0);
                    break;
                case 1:
                    //pedir valor del primer operando.
                    valor1Operando();
                    // Leer y guardar valor del primer operando
                    double operando1 = leerOperando();
                    //pedir valor del segundo operando.
                    valor2Operando();
                    //Leer y guardar valor del segundo operando
                    double operando2 = leerOperando2();
                    //Calcular la suma
                    double resultado = operando1 + operando2;
                    System.out.println("La suma de los dos números es: " + resultado);
                    break;
                case 2:
                    //pedir valor del primer operando.
                    valor1Operando2();
                    // Leer y guardar valor del primer operando
                    double operando1_2 = leerOperando1_2();
                    //pedir valor del segundo operando.
                    valor2Operando2();
                    //Leer y guardar valor del segundo operando
                    double operando2_2 = leerOperando2_2();
                    //Calcular la resta
                    double resultado2 = operando1_2 - operando2_2;
                    System.out.println("La resta de los dos números es: " + resultado2);
                    break;
                case 3:
                    //pedir valor del primer operando.
                    valor1Operando3();
                    // Leer y guardar valor del primer operando
                    double operando1_3 = leerOperando1_3();
                    //pedir valor del segundo operando.
                    valor2Operando3();
                    //Leer y guardar valor del segundo operando
                    double operando2_3 = leerOperando2_3();
                    //Calcular el producto
                    double resultado3 = operando1_3 * operando2_3;
                    System.out.println("El producto de los dos números es: " + resultado3);
                    break;
                case 4:
                    //pedir valor del primer operando.
                    valor1Operando4();
                    // Leer y guardar valor del primer operando
                    double operando1_4 = leerOperando1_4();
                    //pedir valor del segundo operando.
                    valor2Operando4();
                    //Leer y guardar valor del segundo operando
                    double operando2_4 = leerOperando2_4();
                    //Calcular el producto
                    double resultado4 = operando1_4 / operando2_4;
                    System.out.println("La division de los dos números es: " + resultado4);
                    break;
                default:
                    System.out.println("Error, no existe esta opción");
            }
        } while(true);
    }

    private static double leerOperando2_4() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static void valor2Operando4() {
        System.out.print("Escriba el valor del segundo operando:");
    }

    private static double leerOperando1_4() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static void valor1Operando4() {
        System.out.print("Escriba el valor del primer operando:");
    }

    private static double leerOperando2_3() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static void valor2Operando3() {
        System.out.print("Escriba el valor del segundo operando:");
    }

    private static double leerOperando1_3() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static void valor1Operando3() {
        System.out.print("Escriba el valor del primer operando:");
    }

    private static double leerOperando2_2() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static double leerOperando1_2() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static void valor2Operando2() {
        System.out.print("Escriba el valor del segundo operando:");
    }

    private static void valor1Operando2() {
        System.out.print("Escriba el valor del primer operando:");
    }


    private static double leerOperando2() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static void valor2Operando() {
        System.out.print("Escriba el valor del segundo operando:");
    }

    private static double leerOperando() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }


    private static void valor1Operando() {
        System.out.print("Escriba el valor del primer operando:");
    }

    private static int leerOpcion() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirOpcion() {
        System.out.print("Escoja una opción: ");
    }

    private static void escribirMenu() {
        System.out.println("MENÚ OPCIONES\n"+
                "1.Suma\n"+
                "2.Resta\n"+
                "3.Producto\n"+
                "4.División\n"+
                "0.Salir");
    }
}

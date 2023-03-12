package org.example;

import java.util.Scanner;

public class Ejercicio2 {

    public static void menu(){
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
        System.out.println("Elige una de las opciones:");
        System.out.println("1-Mostrar clientes");
        System.out.println("2-Crear un cliente");
        System.out.println("3-Salir");
        opcion = teclado.nextInt();




    }
}

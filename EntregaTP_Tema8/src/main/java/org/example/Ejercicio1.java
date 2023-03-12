package org.example;

import java.util.Scanner;

public class Ejercicio1 {
    static Scanner teclado = new Scanner(System.in);
    public static void GuerraDeDados(){
        String nombre;
        System.out.println("Dime el nombre del jugador 1:");
        nombre = teclado.nextLine();
        JugadorGuerra jugador1 = new JugadorGuerra(nombre);

        System.out.println("Dime el nombre del juygador 2:");
        nombre = teclado.nextLine();
        JugadorGuerra jugador2 = new JugadorGuerra(nombre);

        System.out.println("La guerra ha comenzado: ");

        while(jugador1.numFichas!=0 && jugador2.numFichas!=0){
            jugador1.dado.tirarDados();
            System.out.println(jugador1.nombre+" ha sacado un "+jugador1.dado.ultimaCara);

            jugador2.dado.tirarDados();
            System.out.println(jugador2.nombre+" ha sacado un "+jugador2.dado.ultimaCara);
            if(jugador1.dado.ultimaCara>jugador2.dado.ultimaCara){
                jugador1.numFichas++;
                jugador2.numFichas--;
            }else if(jugador2.dado.ultimaCara>jugador1.dado.ultimaCara){
                jugador2.numFichas++;
                jugador1.numFichas--;
            }

            System.out.println("\nMarcador: "+jugador1.nombre+" "+jugador1.numFichas+" - "+
                    jugador2.nombre+" "+jugador2.numFichas);
        }
        if(jugador1.numFichas==0){
            System.out.println("Felicidades "+jugador2.nombre+" has ganado");
        }else{
            System.out.println("Felicidades "+jugador1.nombre+" has ganado");
        }


    }
}

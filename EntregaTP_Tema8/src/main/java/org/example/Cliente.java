package org.example;

public class Cliente {
    String nombre ;
    String numeroCliente="COD-";
    long contador =0;

    public Cliente(String nombre){
        this.nombre = nombre;
        this.numeroCliente+=contador;
        this.contador++;
    }
}

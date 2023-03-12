package org.example;

public class Cliente {
    private String nombre ;
    private String numeroCliente="CLIENTE-";
    static private long contador =1;

    public Cliente(String nombre){
        this.nombre = nombre;
        this.numeroCliente+=contador;
        contador++;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroCliente() {
        return this.numeroCliente;
    }

    @Override
    public String toString() {
        return "Nombre: "+this.nombre+",  Codigo: "+this.numeroCliente;
    }



}

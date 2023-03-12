package org.example;

public class Libro extends Obra{
    int numeroPaginas;
    public Libro(String titulo,String autor,int numeroPaginas){
        super(titulo,autor);
        this.numeroPaginas = numeroPaginas;
    }
}

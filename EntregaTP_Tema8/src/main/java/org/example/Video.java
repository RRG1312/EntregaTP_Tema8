package org.example;

public class Video extends Obra{
    int duracion;
    public Video(String titulo,String autor,int duracion){
        super(titulo,autor);
        this.duracion= duracion;
    }
}

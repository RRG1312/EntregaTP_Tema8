package org.example;

public class Obra {
    String titulo;
    String autor;
    String codigoObra="OBRA-";
    private static long contador =1;

    public Obra(String titulo,String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.codigoObra+=contador;
        contador++;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getNumeroObra() {
        return codigoObra;
    }
}

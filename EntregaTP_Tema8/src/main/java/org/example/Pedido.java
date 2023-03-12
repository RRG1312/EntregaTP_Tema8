package org.example;

public class Pedido {
    String codigoCliente;
    String codigoObra;

    public Pedido(String codigoCliente, String codigoObra){
        this.codigoCliente = codigoCliente;
        this.codigoObra = codigoObra;
    }

    @Override
    public String toString() {
        return "Pedido del cliente "+this.codigoCliente+" ha pedido la obra con codigo "+this.codigoObra;
    }
}

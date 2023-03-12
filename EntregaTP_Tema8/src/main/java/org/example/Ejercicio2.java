package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    static Scanner teclado = new Scanner(System.in);
    static private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    static private ArrayList<Pedido> listaPedidos = new ArrayList<Pedido>();

    static private ArrayList<Obra> listaObras = new ArrayList<Obra>();
    public static void menu(){
        Scanner teclado = new Scanner(System.in);
        int opcion=0 ;
        while (opcion!=6) {
            System.out.println("Elige una de las opciones:");
            System.out.println("1-Mostrar clientes");
            System.out.println("2-Crear un cliente");
            System.out.println("3-Crear una obra");
            System.out.println("4-Crear un pedido");
            System.out.println("5-Mostrar pedidos");
            System.out.println("6-Salir");
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    mostrarClientes();
                    break;
                case 2:
                    anadirCliente();
                    break;
                case 3:
                    crearObra();
                    break;
                case 4:
                    crearPedido();
                    break;
                case 5:
                    mostrarPedidos();
                    break ;
                case 6:
                    System.out.println("Hasta la proxima");
                    break;
            }
        }
    }


    private static void mostrarClientes(){
        if(!listaClientes.isEmpty()){
            for (Cliente c:listaClientes) {
                System.out.println("\n"+c+"\n");
            }
        }else{
            System.out.println("\nTodavia no hay clientes\n ");
        }

    }

    private static void anadirCliente(){
        String nombre;
        System.out.println("Dime el nombre del cliente:");
        Cliente cliente = new Cliente(nombre = teclado.nextLine());
        listaClientes.add(cliente);
        System.out.println("\nCliente creado con exito\n");
    }

    private static void crearObra(){
        System.out.println("Tipo? :");
        System.out.println("1 - Libro");
        System.out.println("2 - Video");
        int opcion = teclado.nextInt();

        teclado.nextLine();

        System.out.println("Titulo? :");
        String titulo = teclado.nextLine();

        System.out.println("Autor? :");
        String autor = teclado.nextLine();
        if(opcion ==1){
            System.out.println("Cuantas paginas tiene el libro? :");
            int numPaginas = teclado.nextInt();
            Libro libro = new Libro(titulo,autor,numPaginas);
            listaObras.add(libro);
            System.out.println("Libro "+titulo+"("+numPaginas+" paginas) añadido");
        }else if (opcion ==2){
            System.out.println("Cuanto dura el video(min)? :");
            int duracion = teclado.nextInt();
            Video video = new Video(titulo,autor,duracion);
            listaObras.add(video);
            System.out.println("Video "+titulo+"("+duracion/60+"h "+duracion%60+"min)"+ "añadido");
        }else{
            System.out.println("Solo puedes elegir opcion 1 o 2");
        }
    }

    private static void crearPedido() {
        int opcionCliente, opcionObra=0;
        int ultimo;
        if(!listaClientes.isEmpty() && !listaObras.isEmpty()) {
            System.out.println("Para que cliente?:");
            for (Cliente c : listaClientes) {
                System.out.println("Cliente n." + c.getNumeroCliente().charAt(c.getNumeroCliente().length() - 1) + " : " + c.getNombre());
            }
            opcionCliente = teclado.nextInt();

            while (opcionObra != listaObras.size() + 1) {

                System.out.println("Que obra deseas agregar?:");
                for (Obra o : listaObras) {
                    System.out.println(o.getNumeroObra().charAt(o.getNumeroObra().length()-1) + " - " + o.getTitulo());
                }
                System.out.println( listaObras.size()+1+ " - Terminar pedido");
                opcionObra = teclado.nextInt();
                if(opcionObra!= listaObras.size()+1){
                    Pedido pedido = new Pedido("CLIENTE-"+opcionCliente,"OBRA-"+opcionObra);
                    listaPedidos.add(pedido);
                }
                teclado.nextLine();
            }
        }else{
            System.out.println("No se pueden añadir pedidos ya que una de las listas de clientes u obras esta vacia");
        }
    }

    private static void mostrarPedidos(){
        if(!listaPedidos.isEmpty()){
            for (Pedido p:listaPedidos) {
                System.out.println("\n"+p+"\n");
            }
        }else{
            System.out.println("\nTodavia no hay pedidos\n ");
        }

    }



}

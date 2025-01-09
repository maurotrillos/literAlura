package com.maurotrillos.LiterAlura.principal;

import com.maurotrillos.LiterAlura.model.Autor;
import com.maurotrillos.LiterAlura.model.Datos;
import com.maurotrillos.LiterAlura.model.DatosLibros;
import com.maurotrillos.LiterAlura.model.Libro;
import com.maurotrillos.LiterAlura.service.ConsumoAPI;
import com.maurotrillos.LiterAlura.service.ConvierteDatos;

import javax.xml.crypto.Data;
import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos convierteDatos = new ConvierteDatos();
    private final String API_URL = "https://gutendex.com/books/?search=";
    private Libro libro;
    private DatosLibros datosLibros;

    public void mostrarMenu() {
        var opcion = -1;
        String menuDeInicio = """
                1- Buscar libro por titulo.
                2- Buscar libros registrados en la base de datos.
                3- Lista de autores registrados
                4- Lista de autores vivos en un determinado año
                5- Lista de libros por idioma
                
                0- Salir.
                """;
        while (opcion != 0){
            System.out.println("\n***** Bienvenido a LiterAlura *****");
            System.out.println("Tu Fuente confiable en las consultas de tus libros");
            System.out.println(menuDeInicio);
            try {
                    opcion = teclado.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Error a ingresar la opcion solo puedes ingresar un numero de las opciones");
            } finally {
                teclado.nextLine();
            }

            switch (opcion){
                case 1:
                    buscarLibroPorTitulo();
                    break;
                case 0:
                    System.out.println("gracias por usar literAlura");
                    break;
                default:
                    System.out.println("opcion invalida, vuelva a intentar.");
                   break;
            }
        }
    }

    private void buscarLibroPorTitulo() {
        Datos datos = getDatosLibros();
        System.out.println(datos);

        Optional<DatosLibros> libros = datos.resultadosLibros().stream()
                .findFirst();

        if (libros.isPresent()){

        } else {
            System.out.println("libro no encontrado");
        }

    }

    private Datos getDatosLibros() {
        System.out.println("Ingrese el nombre  del libro que desea buscar");
        String nombre = teclado.nextLine();
        String nombreDelLibro = nombre.toLowerCase().replace(" ", "%20");
        var json = consumoAPI.obtenerDatosApi(API_URL + nombreDelLibro);
        var datos = convierteDatos.convertirDatos(json, Datos.class);
        return datos;
    }
}

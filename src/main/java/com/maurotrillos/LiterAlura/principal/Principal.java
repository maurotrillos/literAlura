package com.maurotrillos.LiterAlura.principal;

import com.maurotrillos.LiterAlura.service.ConsumoAPI;
import com.maurotrillos.LiterAlura.service.ConvierteDatos;

import java.util.Scanner;

public class Principal {
    private Scanner lectura = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private final String busqueda = "https://gutendex.com/books?search=";
    private ConvierteDatos conversor = new ConvierteDatos();
    public void muestraElMenu(){

    }

}

package com.maurotrillos.LiterAlura.model;

public class Libro {
    private String titulo;
    private String autor;
    private String idioma;
    private int cantidadDescargas;

    public Libro(String titulo, String autor, String idioma, int cantidadDescargas) {
        this.titulo = titulo;
        this.autor = autor;
        this.idioma = idioma;
        this.cantidadDescargas = cantidadDescargas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getCantidadDescargas() {
        return cantidadDescargas;
    }

    public void setCantidadDescargas(int cantidadDescargas) {
        this.cantidadDescargas = cantidadDescargas;
    }

    @Override
    public String toString() {
        return  "---------- Libro ----------" +
                "\nTitulo: " + titulo  +
                "\nAutor = " + autor  +
                "\nIdioma = " + idioma +
                "\nNumero de descargas = " + cantidadDescargas +
                "\n-------------------------" ;
    }
}

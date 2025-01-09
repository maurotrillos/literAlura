package com.maurotrillos.LiterAlura.model;

public class Libro {
    private String titulo;
    private String nombreAutor;
    private String idioma;
    private Integer cantidadDeDescargas;
    private Autor autor;

    public Libro() {

    }

    public Libro(DatosLibros datos){
        this.titulo = datos.titulo();
        Autor autor = new Autor(datos.autor().get(0));
        this.nombreAutor = autor.getNombreAutor();
        this.idioma =datos.idioma().get(0);
        this.cantidadDeDescargas = datos.numeroDeDescargas();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Integer getCantidadDeDescargas() {
        return cantidadDeDescargas;
    }

    public void setCantidadDeDescargas(Integer cantidadDeDescargas) {
        this.cantidadDeDescargas = cantidadDeDescargas;
    }

    @Override
    public String toString() {
        return "---------- Libro ----------" +
                "\nTitulo: " + titulo  +
                "\nAutor = " + nombreAutor  +
                "\nIdioma = " + idioma +
                "\nNumero de descargas = " + cantidadDeDescargas +
                "\n-------------------------" ;
    }
}

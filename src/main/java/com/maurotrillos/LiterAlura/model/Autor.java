package com.maurotrillos.LiterAlura.model;

import java.util.List;

public class Autor {
    private  String nombreAutor;
    private Integer fechaDeNacimiento;
    private Integer fechaDemuerte;
    private List<Libro> librosDelAutor;

    public Autor(DatosAutor datosAutor) {
        this.nombreAutor = datosAutor.nombreDelAutor();
        this.fechaDeNacimiento = Integer.valueOf(datosAutor.fechaDeNacimiento());
        this.fechaDemuerte = Integer.valueOf(datosAutor.fechaDeMuerte());

    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public Integer getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Integer fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Integer getFechaDemuerte() {
        return fechaDemuerte;
    }

    public void setFechaDemuerte(Integer fechaDemuerte) {
        this.fechaDemuerte = fechaDemuerte;
    }

    public List<Libro> getLibrosDelAutor() {
        return librosDelAutor;
    }

    public void setLibrosDelAutor(List<Libro> librosDelAutor) {
        this.librosDelAutor = librosDelAutor;
    }
}

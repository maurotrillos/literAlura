package com.maurotrillos.LiterAlura.model;

import java.time.LocalDate;

public class Autor {
    private String nombre;
    private LocalDate fechaNacimiento;
    private LocalDate fechaMuerte;  // Puede ser null si está vivo

    // Constructor
    public Autor(String nombre, LocalDate fechaNacimiento, LocalDate fechaMuerte) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaMuerte = fechaMuerte;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaMuerte() {
        return fechaMuerte;
    }

    public void setFechaMuerte(LocalDate fechaMuerte) {
        this.fechaMuerte = fechaMuerte;
    }


    public boolean estaVivoEnAño(int año) {
        LocalDate fechaLimite = LocalDate.of(año, 12, 31);
        return (fechaMuerte == null || fechaMuerte.isAfter(fechaLimite));
    }


    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Nacido: " + fechaNacimiento + ", Fallecido: " + (fechaMuerte != null ? fechaMuerte : "Aún vivo");
    }
}


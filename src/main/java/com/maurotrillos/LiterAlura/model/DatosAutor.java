package com.maurotrillos.LiterAlura.model;

import java.time.LocalDate;

public record DatosAutor(
        String nombre,
        LocalDate fechaNacimiento,
        LocalDate fechaMuerte) {
}

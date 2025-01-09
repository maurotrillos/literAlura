package com.maurotrillos.LiterAlura.service;

public interface IConvierteDatos {
    <T> T convertirDatos(String json, Class<T> clase);
}

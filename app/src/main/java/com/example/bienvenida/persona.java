package com.example.bienvenida;

import java.io.Serializable;

public class persona implements Serializable {

    private String Nombre;
    private String Edad;

    public persona(String nombre, String edad) {
        Nombre = nombre;
        Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String edad) {
        Edad = edad;
    }
}

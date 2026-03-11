package com.example;
public class LibroTextoUNIAC extends LibroTexto {

    private String facultad;

    public LibroTextoUNIAC(String titulo, String autor, int ejemplares, int prestados, String curso, String facultad) {
        super(titulo, autor, ejemplares, prestados, curso);
        this.facultad = facultad;
    }

    public String toString() {
        return super.toString() + "\nFacultad: " + facultad;
    }
}
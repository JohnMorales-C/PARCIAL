package com.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Libro libro1 = new Libro("Java Basico", "Juan Perez", 5, 1);

        Libro libro2 = new Libro();

        System.out.println("Ingrese titulo:");
        libro2.setTitulo(sc.nextLine());

        System.out.println("Ingrese autor:");
        libro2.setAutor(sc.nextLine());

        System.out.println("Numero de ejemplares:");
        libro2.setEjemplares(sc.nextInt());

        System.out.println("Numero de prestados:");
        libro2.setPrestados(sc.nextInt());

        sc.nextLine();

        LibroTextoUNIAC libro3 = new LibroTextoUNIAC(
                "Programacion",
                "Carlos Lopez",
                10,
                2,
                "Programacion II",
                "Ingenieria"
        );

        Novela novela1 = new Novela(
                "La guerra de los mundos",
                "H.G Wells",
                3,
                0,
                "Ciencia ficcion"
        );

        System.out.println("\nPrestamo libro1: " + libro1.prestamo());

        System.out.println("Devolucion libro1: " + libro1.devolucion());

        System.out.println("\nLibro 1");
        System.out.println(libro1);

        System.out.println("\nLibro 2");
        System.out.println(libro2);

        System.out.println("\nLibro Texto UNIAC");
        System.out.println(libro3);

        System.out.println("\nNovela");
        System.out.println(novela1);

        sc.close();
    }

}
package Fideflix;

import Fideflix.Clases.Pelicula;
import Fideflix.Clases.Serie;
import Fideflix.Clases.Documental;

import Fideflix.Clases.Usuario;
import Fideflix.Clases.UsuarioNoEncontradoException;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/*
* -------- Fideflix ---------
* Práctica Programada 1: Clases y Objetos, Herencia (Valor 4%) [Calificada]
* Práctica Programada 2: Polimorfismo, Excepciones y Colecciones (Valor 4%)
*
* Author: Oswald Reid Villalobos
* Profesor: MORALES MENDOZA JERSON ENRIQUE
* Curso: SC-303 Programación Cliente/Servidor Concurrente
* */

public class Main {

    public static void main(String[] args) {

        //Inicializamos los objetos tipo AudioVisual
        Pelicula pelicula     = new Pelicula("Duna", "Ciencia Ficción", 9.4, "Buena pelicula.", "Denis Villeneuve", 166,190000000.00);
        Serie serie           = new Serie("Dr. House", "Medicina", 8.9, "Entretenida.", 8, 177);
        Documental documental = new Documental("Chernobyl","Terror",9.6,"Increible.","Vida Real");

        //Inicializmos el objeto usuario para el Login
        Usuario usuario   = new Usuario("oswald", "oswald@gmail.com");

        //Llamamos al Login
        Usuario.Login(usuario);

        //Creamos una colección de usuarios
        List<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new Usuario("oswald_reid", "oswald@example.com"));
        usuarios.add(new Usuario("bob_jones", "bob@example.com"));
        usuarios.add(new Usuario("charlie_brown", "charlie@example.com"));
        usuarios.add(new Usuario("dave_wilson", "dave@example.com"));
        usuarios.add(new Usuario("eve_davis", "eve@example.com"));
        usuarios.add(new Usuario("frank_moore", "frank@example.com"));
        usuarios.add(new Usuario("grace_taylor", "grace@example.com"));
        usuarios.add(new Usuario("henry_clark", "henry@example.com"));
        usuarios.add(new Usuario("ivy_white", "ivy@example.com"));
        usuarios.add(new Usuario("jackie_harris", "jackie@example.com"));

        // Imprimir la lista de usuarios
        System.out.println("Lista de usuarios (No Ordenada):\n");
        for (Usuario u : usuarios) {
            System.out.println("Usuario: " + u.getNombreUsuario() + " | Email: " + u.getEmail());
        }

        //Eliminar Usuario (andrei_reid)
        System.out.println("\nEliminando usuario [andrei_reid].... ");
        try {
            eliminarUsuario(usuarios, "andrei_reid");
        } catch (UsuarioNoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        // Ordenar la lista de usuarios
        Collections.sort(usuarios);

        // Imprimir la lista de usuarios ordenados
        System.out.println("\nLista de usuarios [Ordenada]:\n");
        for (Usuario u : usuarios) {
            System.out.println("Usuario: " + u.getNombreUsuario() + " | Email: " + u.getEmail());
        }

        // Destrucción de los objetos que fueron creados
        pelicula = null;
        serie = null;
        documental = null;
        usuario = null;
        usuarios.clear();
    }

    private static void eliminarUsuario(List<Usuario> usuarios, String nombreUsuario) throws UsuarioNoEncontradoException {
        boolean eliminado = usuarios.removeIf(u -> u.getNombreUsuario().equals(nombreUsuario));
        if (!eliminado) {
            throw new UsuarioNoEncontradoException("Usuario " + nombreUsuario + " no se encuentra en la lista [usuarios].");
        }
    }

}

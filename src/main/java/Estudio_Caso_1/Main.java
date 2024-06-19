package Estudio_Caso_1;

import Estudio_Caso_1.Clases.*;

/*
 * -------- Biblioteca de la Universidad Fidélitas ---------
 * Estudio Caso Práctico 1: Clases y Objetos, Herencia, Polimorfismo, Excepciones (Valor 10%)
 *
 * Author: Oswald Reid Villalobos
 * Profesor: MORALES MENDOZA JERSON ENRIQUE
 * Curso: SC-303 Programación Cliente/Servidor Concurrente
 * */

public class Main {

    public static void main(String[] args) {

        Libro libro     = new Libro("El instituto", "Advance Publications, Hallmark", 471,"Stephen King","BR15516684");
        Revista revista = new Revista("National Geographic", "National Geographic Society", 120,2024,"Enero");
        EBook ebook     = new EBook("Boa", "Editorial Universidad Nacional", 328,"MP3",400);

        ebook.reproducir(ebook.getTitulo(),ebook.getPaginas());

        Libreria.prestarPublicacion(libro,200);
        Libreria.prestarPublicacion(revista,0);
        Libreria.prestarPublicacion(ebook,0);

        Libreria.devolverPublicacion(libro,2);
        Libreria.devolverPublicacion(revista,4);
        Libreria.devolverPublicacion(ebook,0);
    }

}

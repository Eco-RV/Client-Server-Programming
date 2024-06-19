package Estudio_Caso_1.Clases;

import Estudio_Caso_1.Excepciones.EBookNoSeDevuelve;

import java.sql.SQLOutput;

public class Libreria {

    public static void prestarPublicacion(Publicacion publicacion,double precio) {
        publicacion.prestar(precio);
    }

    public static void devolverPublicacion(Publicacion publicacion, int dias_Retraso) {
        try {
            publicacion.devolver(dias_Retraso);
        } catch (EBookNoSeDevuelve e) {
            System.out.println(e.getMessage());;
        }
    }
}

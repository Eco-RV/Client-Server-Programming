package Fideflix.Clases;

import java.util.ArrayList;
import java.util.List;

public abstract class Audiovisual {

    private String titulo;
    private String genero;
    private double calificacion;
    private List<String> comentarios;

    public Audiovisual(
            String titulo,
            String genero,
            double calificacion,
            String comentarios
    ) {
        this.titulo         = titulo;
        this.genero         = genero;
        this.calificacion   = calificacion;
        this.comentarios    = new ArrayList<>();
    }

    //Gets

    public String getTitulo() {
        return titulo;
    }
    public String getGenero() {
        return genero;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public List<String> geComentarios() {
        return new ArrayList<>(comentarios);
    }

    //Sets
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void agregarComentarios(String comentario) {
        comentarios.add(comentario);
    }

    public void eliminarComentarios(String comentario) {
        comentarios.remove(comentario);
    }

    public void limpiarComentarios() {
        comentarios.clear();
    }
}

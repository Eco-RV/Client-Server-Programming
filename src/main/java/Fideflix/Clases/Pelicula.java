package Fideflix.Clases;

public class Pelicula extends Audiovisual implements Comparable<Pelicula> {

    private String director;
    private int duracion;

    public Pelicula(
            String titulo,
            String genero,
            double calificacion,
            String comentarios,
            String director,
            int duracion,
            double presupuesto
    ) {
        super(titulo, genero, calificacion, comentarios);
        this.director = director;
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public int compareTo(Pelicula otraPelicula) {
        return this.getTitulo().compareTo(otraPelicula.getTitulo());
    }
}

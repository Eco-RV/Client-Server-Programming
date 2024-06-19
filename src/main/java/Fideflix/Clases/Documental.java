package Fideflix.Clases;

//Hereda de la clase Audiovisual

public class Documental extends Audiovisual implements Comparable<Documental> {
    private String tema;

    public Documental(
            String titulo,
            String genero,
            double calificacion,
            String comentarios,
            String tema
    ) {
        super(titulo, genero, calificacion, comentarios);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public int compareTo(Documental otroDocumental) {
        return this.getTitulo().compareTo(otroDocumental.getTitulo());
    }

}
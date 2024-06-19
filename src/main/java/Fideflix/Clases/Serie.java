package Fideflix.Clases;

public class Serie extends Audiovisual implements Comparable<Serie> {
    private int temporadas;
    private int episodios;

    public Serie(
            String titulo,
            String genero,
            double calificacion,
            String comentarios,
            int temporadas,
            int episodios
    ) {
        super(titulo, genero, calificacion, comentarios);
        this.temporadas = temporadas;
        this.episodios = episodios;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public int compareTo(Serie otraSerie) {
        return this.getTitulo().compareTo(otraSerie.getTitulo());
    }
}
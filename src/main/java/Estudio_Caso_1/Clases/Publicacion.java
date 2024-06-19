package Estudio_Caso_1.Clases;

import Estudio_Caso_1.Excepciones.EBookNoSeDevuelve;

public abstract class Publicacion {

    protected String titulo;
    protected String editorial;
    protected int paginas;

    public Publicacion(String titulo, String editorial, int paginas) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.paginas = paginas;
    }

    public String getEditorial() {
        return editorial;
    }
    public int getPaginas() {
        return paginas;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public abstract void prestar(double precio);

    public abstract double devolver(int diasRetraso) throws EBookNoSeDevuelve;
}

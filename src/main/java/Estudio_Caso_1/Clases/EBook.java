package Estudio_Caso_1.Clases;

import Estudio_Caso_1.Excepciones.EBookNoSeDevuelve;
import Estudio_Caso_1.Interfaces.Reproducible;

public class EBook extends Publicacion implements Reproducible {

    private String formato;
    private double cantidad_MB;

    public EBook() {
        super("", "", 0);
        this.formato = "";
        this.cantidad_MB = 0.0;
    }

    public EBook(String titulo, String editorial, int paginas, String formato, double cantidad_MB) {
        super(titulo, editorial, paginas);
        this.formato = "";
        this.cantidad_MB = 0.0;
    }

    public String getFormato() {
        return formato;
    }
    public double getCantidad_MB() {
        return cantidad_MB;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
    public void setCantidad_MB(double cantidad_MB) {
        this.cantidad_MB = cantidad_MB;
    }

    @Override
    public void reproducir(String titulo, int paginas) {
        System.out.println("Reproduciendo " + titulo);
    }

    @Override
    public void detener(String titulo) {
        System.out.println("Deteniendo la reproducción de " + titulo);
    }

    @Override
    public void prestar(double precio) {
        System.out.println("El Ebook '" + titulo + "' no se puede prestar. Se adjunta el URL de descarga: [Descargar/Ebook/"+ titulo + "]");
    }

    @Override
    public double devolver(int diasRetraso) throws EBookNoSeDevuelve {
        throw new EBookNoSeDevuelve("Un Ebook no se puede devolver.");
    }


}

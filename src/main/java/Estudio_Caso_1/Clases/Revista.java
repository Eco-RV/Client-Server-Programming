package Estudio_Caso_1.Clases;

public class Revista extends Publicacion{

    private int edicion;
    private String mes;

    public Revista() {
        super("", "", 0);
        this.edicion = 0;
        this.mes = "";
    }

    public Revista(String titulo, String editorial, int paginas, int edicion, String mes) {
        super(titulo, editorial, paginas);
        this.edicion = 0;
        this.mes = "";
    }

    public String getMes() {
        return mes;
    }
    public int getEdicion() {
        return edicion;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    @Override
    public void prestar(double precio) {
        System.out.println("La Revista '" + titulo + "' se puede prestar solo por 5 días.");
    }

    @Override
    public double devolver(int diasRetraso) {
        return diasRetraso * 1.5;
    }

}

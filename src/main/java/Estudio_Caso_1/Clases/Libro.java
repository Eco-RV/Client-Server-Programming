package Estudio_Caso_1.Clases;

public class Libro extends Publicacion {

    private String autor;
    private String codigo_barra;
    private double precio_compra;

    public Libro() {
        super("", "", 0);
        this.autor = "";
        this.codigo_barra = "";
        this.precio_compra = 0;
    }

    public Libro(String titulo,String editorial, int paginas, String autor, String codigo_barra) {
        super(titulo, editorial, paginas);
        this.autor = "";
        this.codigo_barra = "";
        this.precio_compra = 0;
    }

    public String getAutor() {
        return autor;
    }
    public String getCodigo_barra() {
        return codigo_barra;
    }
    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setCodigo_barra(String codigo_barra) {
        this.codigo_barra = codigo_barra;
    }
    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    @Override
    public void prestar(double precio) {
        if (precio < 200) {
            System.out.println("El libro '" + titulo + "' se puede prestar por 15 días.");
        } else {
            System.out.println("El libro '" + titulo + "' se puede prestar por 3 días.");
        }
    }

    @Override
    public double devolver(int diasRetraso) {
        return diasRetraso * 2.0;
    }

}

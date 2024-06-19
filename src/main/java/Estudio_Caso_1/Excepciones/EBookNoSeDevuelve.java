package Estudio_Caso_1.Excepciones;

public class EBookNoSeDevuelve extends Exception {
    public EBookNoSeDevuelve(String message) {
        super(message);
    }
}

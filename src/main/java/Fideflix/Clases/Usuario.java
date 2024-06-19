package Fideflix.Clases;

public class Usuario implements Comparable<Usuario> {
    private String nombreUsuario;
    private String email;

    public Usuario(
            String nombreUsuario,
            String email
    ) {
        this.nombreUsuario = nombreUsuario;
        this.email = email;
    }

    //Gets
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    //Sets
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Metodos Publicos
    public static void Login(Usuario usuario) {
        System.out.println("\n¡Bienvenido " + usuario.getNombreUsuario() + "!\n");
    }
    @Override
    public int compareTo(Usuario otroUsuario) {
        return this.nombreUsuario.compareTo(otroUsuario.getNombreUsuario());
    }
}

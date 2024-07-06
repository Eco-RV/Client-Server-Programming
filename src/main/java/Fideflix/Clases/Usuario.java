package Fideflix.Clases;

public class Usuario implements Comparable<Usuario> {
    private String nombreUsuario;
    private String email;
    private String clave;


    public Usuario() {
        this.nombreUsuario = "";
        this.email = "";
        this.clave = "";
    }
    
    public Usuario(
            String nombreUsuario,
            String email,
            String password
    ) {
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.clave = password;
    }

    //Gets
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public String getClave() {
        return clave;
    }

    //Sets
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setClave(String clave) {
        this.clave = clave;
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

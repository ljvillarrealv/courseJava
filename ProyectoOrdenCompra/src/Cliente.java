public class Cliente {

    private String Nombre;
    private String Apellido;

    public Cliente(String nombre, String apellido) {
        Nombre = nombre;
        Apellido = apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }
}

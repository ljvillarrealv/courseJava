public class Producto {

    private String nombreProducto;
    private Double Precio;

    public Producto(String nombreProducto, Double Precio ) {
    this.nombreProducto = nombreProducto;
    this.Precio = Precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombre) {
        this.nombreProducto = nombreProducto;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        this.Precio = Precio;
    }
}

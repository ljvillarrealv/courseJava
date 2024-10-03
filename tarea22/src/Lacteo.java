public class Lacteo extends Producto {

    private int cantidad;
    private int proteinas;

    public Lacteo(String nombreProducto, Double precio, int cantidad, int proteinas){
        super(nombreProducto, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
          }

    public int getCantidad() {
        return cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }
}

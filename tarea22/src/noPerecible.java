public class noPerecible extends Producto {

    private int contenido;
    private int calorias;

    public noPerecible(String nombreProducto, Double precio, int contenido, int calorias){
        super(nombreProducto, precio);
        this.calorias = calorias;
        this.contenido = contenido;
        }

    public int getContenido() {
        return contenido;
    }

    public int getCalorias() {
        return calorias;
    }
}

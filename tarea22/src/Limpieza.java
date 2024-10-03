public class Limpieza extends Producto {

    private String componentes;
    private double litros;

    public Limpieza(String nombreProducto, Double precio, String componentes, double litros){
        super(nombreProducto, precio);
        this.componentes = componentes;
        this.litros = litros;
    }

    public String getComponentes() {
        return componentes;
    }

    public double getLitros() {
        return litros;
    }
}

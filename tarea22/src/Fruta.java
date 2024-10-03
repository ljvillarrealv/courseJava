public class Fruta extends Producto {

    private double peso;
    private String color;

    public Fruta(String nombreProducto, Double Precio,double peso,String color){
        super ( nombreProducto, Precio);
        this.color = color;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }
}

import java.util.Date;

public class EjemploOrdenes {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("luis", "Villarreal");
        Cliente cliente2 = new Cliente("Amanda", "Nova");
        Cliente cliente3 = new Cliente("Jose", "Velasquez");

        Producto producto1 = new Producto("LG", "TV", 2000);
        Producto producto2 = new Producto("SONY", "PS5", 1800);
        Producto producto3 = new Producto("MICROSOFT", "XBOX", 1500);
        Producto producto4 = new Producto("EPIC", "GAME", 200);

        OrdenCompra orden1 = new OrdenCompra("Primera orden");
        orden1.setCliente(cliente1);
        orden1.setFecha(new Date());
        orden1.addProducto(producto1);
        orden1.addProducto(producto2);

        OrdenCompra orden2 = new OrdenCompra("Segunda orden");
        orden2.setCliente(cliente2);
        orden2.setFecha(new Date());
        orden2.addProducto(producto3);

        OrdenCompra orden3 = new OrdenCompra("Tercera orden");
        orden3.setCliente(cliente3);
        orden3.setFecha(new Date());
        orden3.addProducto(producto4);


        imprimirOrden(orden1);
        imprimirOrden(orden2);
        imprimirOrden(orden3);
    }

    public static void imprimirOrden(OrdenCompra orden) {
        {
            System.out.println("orden # = " + orden.getIdentificador());
            System.out.println("Descripcion = " + orden.getDescripcion());
            System.out.println("Fecha = " + orden.getFecha());
            System.out.println("Cliente = " + orden.getCliente().getNombre() + " " + orden.getCliente().getApellido());
            System.out.println("producto:");
            for (Producto producto : orden.getProductos()) {
                if (producto != null) {
                    System.out.println(" - Fabricante: " + producto.getFabricante()+
                    ", Nombre: " + producto.getNombre()+
                    ", Precio: $" + producto.getPrecio());
                }
            }

        }
    }
}


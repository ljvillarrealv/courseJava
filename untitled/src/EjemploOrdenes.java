import java.util.Date;

class Producto {
    private String fabricante;
    private String nombre;
    private int precio;

    public Producto(String fabricante, String nombre, int precio) {
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
}

class Cliente {
    private String nombre;
    private String apellido;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}

class OrdenCompra {
    private static int contadorId = 1;

    private Integer identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos = new Producto[4];

    public OrdenCompra(String descripcion) {
        this.identificador = contadorId++;
        this.descripcion = descripcion;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void addProducto(Producto producto) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] == null) {
                productos[i] = producto;
                break;
            }
        }
    }

    public int calcularGranTotal() {
        int granTotal = 0;
        for (Producto producto : productos) {
            if (producto != null) {
                granTotal += producto.getPrecio();
            }
        }
        return granTotal;
    }
}

public class EjemploOrdenes {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan", "Perez");
        Cliente cliente2 = new Cliente("Maria", "Gomez");
        Cliente cliente3 = new Cliente("Carlos", "Rodriguez");

        Producto producto1 = new Producto("Fabricante1", "Producto1", 100);
        Producto producto2 = new Producto("Fabricante2", "Producto2", 150);
        Producto producto3 = new Producto("Fabricante3", "Producto3", 200);
        Producto producto4 = new Producto("Fabricante4", "Producto4", 120);

        OrdenCompra orden1 = new OrdenCompra("Orden1");
        orden1.setCliente(cliente1);
        orden1.setFecha(new Date());
        orden1.addProducto(producto1);
        orden1.addProducto(producto2);
        orden1.addProducto(producto3);
        orden1.addProducto(producto4);

        OrdenCompra orden2 = new OrdenCompra("Orden2");
        orden2.setCliente(cliente2);
        orden2.setFecha(new Date());
        orden2.addProducto(producto2);
        orden2.addProducto(producto3);
        orden2.addProducto(producto4);

        OrdenCompra orden3 = new OrdenCompra("Orden3");
        orden3.setCliente(cliente3);
        orden3.setFecha(new Date());
        orden3.addProducto(producto1);
        orden3.addProducto(producto3);
        orden3.addProducto(producto4);

        imprimirOrden(orden1);
        imprimirOrden(orden2);
        imprimirOrden(orden3);
    }

    public static void imprimirOrden(OrdenCompra orden) {
        System.out.println("Orden #" + orden.getIdentificador());
        System.out.println("Descripción: " + orden.getDescripcion());
        System.out.println("Fecha: " + orden.getFecha());
        System.out.println("Cliente: " + orden.getCliente().getNombre() + " " + orden.getCliente().getApellido());
        System.out.println("Productos:");
        for (Producto producto : orden.getProductos()) {
            if (producto != null) {
                System.out.println(" - Fabricante: " + producto.getFabricante() +
                        ", Nombre: " + producto.getNombre() +
                        ", Precio: $" + producto.getPrecio());
            }
        }
        System.out.println("Gran Total: $" + orden.calcularGranTotal());
        System.out.println();
    }
}

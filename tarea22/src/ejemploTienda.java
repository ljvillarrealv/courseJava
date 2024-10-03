public class ejemploTienda {

    public static void main(String[] args) {

        Producto[] productos = new Producto[8];

                // Crear objetos de cada tipo de producto
                productos[0] = new Fruta("Manzana", 1.5, 0.2, "Rojo");
                productos[1] = new Fruta("Banana", 0.8, 0.15, "Amarillo");

                productos[2] = new Lacteo("Leche", 2.0, 1, 3);
                productos[3] = new Lacteo("Yogur", 1.2, 2, 2);

                productos[4] = new Limpieza("Detergente", 3.5, "Químicos", 1.0);
                productos[5] = new Limpieza("Jabón", 1.0, "Fragancia", 0.2);

                productos[6] = new noPerecible("Arroz", 2.5, 2, 350);
                productos[7] = new noPerecible("Pasta", 1.8, 3, 300);

                // Iterar el arreglo de productos e imprimir detalles
                for (Producto producto : productos) {
                    System.out.println("Nombre: " + producto.getNombreProducto());
                    System.out.println("Precio: $" + producto.getPrecio());

                    if (producto instanceof Fruta) {
                        Fruta fruta = (Fruta) producto;
                        System.out.println("Peso: " + fruta.getPeso() + " kg");
                        System.out.println("Color: " + fruta.getColor());
                    } else if (producto instanceof Lacteo) {
                        Lacteo lacteo = (Lacteo) producto;
                        System.out.println("Cantidad: " + lacteo.getCantidad() + " litros");
                        System.out.println("Proteínas: " + lacteo.getProteinas() + " g");
                    } else if (producto instanceof Limpieza) {
                        Limpieza limpieza = (Limpieza) producto;
                        System.out.println("Componentes: " + limpieza.getComponentes());
                        System.out.println("Litros: " + limpieza.getLitros() + " L");
                    } else if (producto instanceof noPerecible) {
                        noPerecible noPerecible = (noPerecible) producto;
                        System.out.println("Contenido: " + noPerecible.getContenido());
                        System.out.println("Calorías: " + noPerecible.getCalorias() + " kcal");
                    }

                    System.out.println();
                }
            }
        }




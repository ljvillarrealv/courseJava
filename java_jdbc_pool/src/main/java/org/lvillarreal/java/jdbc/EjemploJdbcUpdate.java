package org.lvillarreal.java.jdbc;

import org.lvillarreal.java.jdbc.modelo.Producto;
import org.lvillarreal.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.lvillarreal.java.jdbc.repositorio.Repositorio;
import org.lvillarreal.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemploJdbcUpdate {
    public static void main(String[] args) {



            Repositorio<Producto> repositorio =  new ProductoRepositorioImpl();
            System.out.println("===============LISTAR ================");

            repositorio.listar().forEach(System.out::println);


            System.out.println("===============Obtener por ID ================");
            System.out.println(repositorio.porId(1L));

            System.out.println("===============EDITAR PRODUCTO ================");
            Producto producto = new Producto();
            producto.setId(3L);
            producto.setNombre("Teclado RAZR");
            producto.setPrecio(152);
            repositorio.guardar(producto);
            System.out.println("Producto actualizado con exito!!");
            repositorio.listar().forEach(System.out::println);




    }
}

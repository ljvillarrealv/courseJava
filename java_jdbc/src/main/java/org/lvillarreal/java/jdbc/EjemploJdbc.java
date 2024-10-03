package org.lvillarreal.java.jdbc;

import org.lvillarreal.java.jdbc.modelo.Categoria;
import org.lvillarreal.java.jdbc.modelo.Producto;
import org.lvillarreal.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.lvillarreal.java.jdbc.repositorio.Repositorio;
import org.lvillarreal.java.jdbc.util.ConexionBaseDatos;

import java.sql.*;
import java.util.Date;

public class EjemploJdbc {
    public static void main(String[] args) {

        try (Connection conn = ConexionBaseDatos.getInstance()){

            Repositorio<Producto> repositorio =  new ProductoRepositorioImpl();
            System.out.println("===============LISTAR ================");

            repositorio.listar().forEach(System.out::println);


            System.out.println("===============Obtener por ID ================");
            System.out.println(repositorio.porId(1L));

            System.out.println("===============INSERTAR NUEVO PRODUCTO ================");
            Producto producto = new Producto();
            producto.setNombre("MSI RTX 4090");
            producto.setPrecio(5000);
            Categoria categoria = new Categoria();
            producto.setId(3L);
            producto.setFechaRegistro(new Date());
            repositorio.guardar(producto);

            producto.setCategoria(categoria);
            System.out.println("Producto guardado con exito!!");
            repositorio.listar().forEach(System.out::println);


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

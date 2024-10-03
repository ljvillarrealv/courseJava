package org.lvillarreal.java.jdbc;

import org.lvillarreal.java.jdbc.modelo.Producto;
import org.lvillarreal.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.lvillarreal.java.jdbc.repositorio.Repositorio;
import org.lvillarreal.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;

public class EjemploJdbcDelete {
    public static void main(String[] args) {

        try (Connection conn = ConexionBaseDatos.getInstance()){

            Repositorio<Producto> repositorio =  new ProductoRepositorioImpl();
            System.out.println("===============LISTAR ================");

            repositorio.listar().forEach(System.out::println);


            System.out.println("===============Obtener por ID ================");
            System.out.println(repositorio.porId(1L));

            System.out.println("===============ELIMINAR PRODUCTO ================");

            repositorio.eliminar(3L);
            System.out.println("Producto eliminado con exito!!");
            repositorio.listar().forEach(System.out::println);



        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

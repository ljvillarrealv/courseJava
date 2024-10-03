package org.lvillarreal.java.jdbc;

import org.lvillarreal.java.jdbc.modelo.Usuario;
import org.lvillarreal.java.jdbc.repositorio.UsuarioRepositorioImpl;
import org.lvillarreal.java.jdbc.util.ConexionBD;

import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EjemploJDBC {
    public static void main(String[] args) {

        try (Connection conn = ConexionBD.getConnection()){
            UsuarioRepositorioImpl repositorio = new UsuarioRepositorioImpl(conn);
            Scanner sc = new Scanner(System.in);

            Map<String, Integer> operaciones = new HashMap<>();
            operaciones.put("Actualizar", 1);
            operaciones.put("Eliminar", 2);
            operaciones.put("Agregar", 3);
            operaciones.put("Listar", 4);
            operaciones.put("Salir", 5);


                Object[] opArreglo = operaciones.keySet().toArray();
                Object opcion = JOptionPane.showInputDialog(null,
                        "Seleccione una Operación",
                        "Mantenedor de Usuarios",
                        JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

                if (opcion == null) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
                } else {
                    Integer opcionIndice   = operaciones.get(opcion.toString());

                    switch (opcionIndice) {
                        case 1: // Actualizar
                            System.out.println("Ingrese el ID del usuario a actualizar:");
                            Integer idActualizar = sc.nextInt();
                            Usuario usuarioActualizar = repositorio.porId(idActualizar);
                            if (usuarioActualizar != null) {
                                System.out.println("Ingrese el nuevo username:");
                                usuarioActualizar.setUsername(sc.next());
                                System.out.println("Ingrese el nuevo password:");
                                usuarioActualizar.setPassword(sc.next());
                                System.out.println("Ingrese el nuevo email:");
                                usuarioActualizar.setEmail(sc.next());
                                repositorio.guardar(usuarioActualizar);
                            } else {
                                System.out.println("Usuario no encontrado.");
                            }
                            break;
                        case 2: // Eliminar
                            System.out.println("Ingrese el ID del usuario a eliminar:");
                            Long idEliminar = sc.nextLong();
                            repositorio.eliminar(idEliminar);
                            System.out.println("Usuario eliminado.");
                            break;
                        case 3: // Agregar
                            Usuario usuarioNuevo = new Usuario();
                            System.out.println("Ingrese el username:");
                            usuarioNuevo.setUsername(sc.next());
                            System.out.println("Ingrese el password:");
                            usuarioNuevo.setPassword(sc.next());
                            System.out.println("Ingrese el email:");
                            usuarioNuevo.setEmail(sc.next());
                            repositorio.guardar(usuarioNuevo);
                            System.out.println("Usuario agregado.");
                            break;
                        case 4: // Listar
                            System.out.println("Usuarios:");
                            repositorio.listar().forEach(System.out::println);
                            break;
                        case 5: // Salir
                            System.out.println("Saliendo...");
                            break;
                        default:
                            System.out.println("Opción no válida.");
                    }
                }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



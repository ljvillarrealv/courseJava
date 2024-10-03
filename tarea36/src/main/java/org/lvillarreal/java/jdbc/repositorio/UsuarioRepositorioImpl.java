package org.lvillarreal.java.jdbc.repositorio;

import org.lvillarreal.java.jdbc.modelo.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorioImpl implements Repositorio<Usuario>{
    Connection conn;

    public UsuarioRepositorioImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Usuario> listar() {
        List<Usuario> usuarios = new ArrayList<>();
       try(Statement stmt = conn.createStatement();
           ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios")){

           while (rs.next()){
               Usuario usuario = new Usuario();
               usuario.setId(rs.getInt("id"));
               usuario.setUsername(rs.getString("username"));
               usuario.setPassword(rs.getString("password"));
               usuario.setEmail(rs.getString("email"));
               usuarios.add(usuario);
           }
        } catch (SQLException e) {
           throw new RuntimeException(e);
       }
        return usuarios;
    }


    @Override
    public Usuario porId(Integer id) {
        Usuario usuario= null;
        try (PreparedStatement stmt = conn.prepareStatement("SELECT * FROM usuarios WHERE id = ?")){

            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setUsername(rs.getString("username"));
                usuario.setPassword(rs.getString("password"));
                usuario.setEmail(rs.getString("email"));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return usuario;
    }

    @Override
    public void guardar(Usuario usuario) {
        String sql = usuario.getId() > 0 ? "UPDATE usuarios SET username=?, password=?, email=? WHERE id=?"
                : "INSERT INTO usuarios (username, password, email) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getPassword());
            stmt.setString(3, usuario.getEmail());

            if (usuario.getId() > 0) {
                stmt.setInt(4, usuario.getId());
            }

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    @Override
    public void eliminar(Long id) {
        try (PreparedStatement stmt = conn.prepareStatement("DELETE FROM usuarios WHERE id = ?")) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}

package org.lvillarreal.java.jdbc.repositorio;

import java.util.List;

public interface Repositorio <T> {

    List<T> listar();
    T porId(Integer id);
    void guardar (T t);
    void eliminar (Long id);


}

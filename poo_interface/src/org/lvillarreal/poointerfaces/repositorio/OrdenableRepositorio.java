package org.lvillarreal.poointerfaces.repositorio;

import org.lvillarreal.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);
}

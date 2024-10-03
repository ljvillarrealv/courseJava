package org.lvillarreal.poointerfaces.repositorio;

import org.lvillarreal.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}

package br.com.sa.service;

import br.com.sa.model.Comentario;

import java.util.List;

public interface ComentarioService {
    List<Comentario> findAll();

    boolean save(Comentario comentario);
}

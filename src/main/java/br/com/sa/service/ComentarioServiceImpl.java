package br.com.sa.service;

import br.com.sa.model.Comentario;
import br.com.sa.repository.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComentarioServiceImpl implements ComentarioService{
    @Autowired
    ComentarioRepository comentarioRepository;

    @Override
    public List<Comentario> findAll(){
        return comentarioRepository.findAll();
    }
}

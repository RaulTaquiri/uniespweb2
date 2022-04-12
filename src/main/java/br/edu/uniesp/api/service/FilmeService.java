package br.edu.uniesp.api.service;

import br.edu.uniesp.api.model.FilmeJava;
import br.edu.uniesp.api.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FilmeService {

    @Autowired
    private FilmeRepository repository;

    public FilmeJava salvar(FilmeJava filme){
            return repository.save(filme);


    }
    public FilmeJava atualizar(FilmeJava filme) throws Exception{
        if(filme.getId()==null){
            throw new Exception("Id nao encontrado");

        }
        return repository.save(filme);
    }

    public void deletar( int id){
        repository.deleteById(id);
    }

    public List<FilmeJava> listar(){
        return repository.findAll();
    }

}

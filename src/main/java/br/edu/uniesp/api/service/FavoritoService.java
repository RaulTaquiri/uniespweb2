package br.edu.uniesp.api.service;


import br.edu.uniesp.api.model.Favorito;
import br.edu.uniesp.api.repository.FavoritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoritoService {
    @Autowired
    private FavoritoRepository repository;
    public Favorito salvar (Favorito favorito){

        return repository.save(favorito);
    }
    public Favorito atualizar(Favorito favorito)throws Exception{
        if (favorito.getId()==null){
            throw new Exception("Id não encontrado");
        }
        return repository.save(favorito);
    }

    public List<Favorito> listar(){

        return repository.findAll();
    }
    public void deletar(int id){

        repository.deleteById(id);
    }

}
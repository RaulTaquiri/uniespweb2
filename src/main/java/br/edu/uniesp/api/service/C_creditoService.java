package br.edu.uniesp.api.service;

import br.edu.uniesp.api.model.C_credito;
import br.edu.uniesp.api.repository.C_creditoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class C_creditoService {
    @Autowired
    private C_creditoRepository repository;
    public C_credito salvar (C_credito c_credito){
        return repository.save(c_credito);
    }
    public C_credito atualizar(C_credito c_credito) throws Exception{
        if (c_credito.getId()==null){
            throw new Exception("Cartão não encontrado");
        }
        return repository.save(c_credito);
    }
    public void deletar(int id){

        repository.deleteById(id);
    }

    public List<C_credito> listar(){

        return repository.findAll();
    }


}

package br.edu.uniesp.api.resource;


import br.edu.uniesp.api.model.C_credito;
import br.edu.uniesp.api.service.C_creditoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/credito")
public class C_creditoResource {
    @Autowired
    private C_creditoService service;

    @PostMapping
    public C_credito salvar (@RequestBody C_credito c_credito){
        return service.salvar(c_credito);
    }
    @PutMapping
    public C_credito atualizar(@RequestBody C_credito c_credito)throws Exception{
        return service.atualizar(c_credito);
    }
    @GetMapping
    public List<C_credito> listar(){
        return service.listar();
    }
    @DeleteMapping("{id}")
    public void remover(@PathVariable int id){
        service.deletar(id);
    }
}
package br.edu.uniesp.api.resource;

import br.edu.uniesp.api.model.Favorito;
import br.edu.uniesp.api.service.FavoritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/favorito")

public class FavoritoResource {
    @Autowired
    private FavoritoService service;
    @PostMapping
    public Favorito salvar (@RequestBody Favorito favorito){
        return service.salvar(favorito);
    }
    @PutMapping
    public Favorito atualizar(@RequestBody Favorito favorito)throws Exception{
        return service.atualizar(favorito);
    }
    @DeleteMapping("{id}")
    public void remover(@PathVariable int id){
        service.deletar(id);
    }
    @GetMapping
    public List<Favorito> listar(){
        return service.listar();
    }
}

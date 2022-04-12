package br.edu.uniesp.api.resource;


import br.edu.uniesp.api.model.FilmeJava;
import br.edu.uniesp.api.repository.FilmeRepository;
import br.edu.uniesp.api.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/filme")
public class FilmeResource {

    @Autowired
    private FilmeService service;

    @GetMapping ("/teste")
    public FilmeJava teste(){
        FilmeJava f = new FilmeJava();
        f.setTitulo("Jurassic Park");
        return f;
    }

    @PostMapping
    public FilmeJava salvar(@RequestBody FilmeJava filme){
        filme = service.salvar(filme);
        return filme;
    }

        //PUT localhost:8080/filme
    /*
      {
        "id": 3,
        "titulo": "Alterando Filme"
      }
     */

    @PostMapping
    public FilmeJava atualizar(@RequestBody FilmeJava filme) throws Exception {
        return service.atualizar(filme);
    }
    @DeleteMapping
    public String remover(){
        return "Removendo";
    }

    @PutMapping
    public String atualizar(){
        return "Atualizou";
    }

    @GetMapping
    public String listar(){
        return "Deveria retornar lista";
    }


}

package br.edu.uniesp.api.resource;


import br.edu.uniesp.api.model.Usuario;
import br.edu.uniesp.api.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioResource {

    @Autowired
    private UsuarioService service;


    @PostMapping
    public Usuario salvar(@RequestBody Usuario usuario) {
        usuario = service.salvar(usuario);
        return usuario;
    }
    @PutMapping
    public Usuario atualizar(@RequestBody Usuario usuario) throws Exception {
        return service.atualizar(usuario);
    }
    @GetMapping
    public List<Usuario> listar(){
        return service.listar();
    }

}


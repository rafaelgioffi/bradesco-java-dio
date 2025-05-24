package dio.web.api.controller;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    @PostMapping("/users")
    public void post(@RequestBody Usuario usuario){
        repository.save(usuario);
    }

    @PutMapping("/users")
    public void put(@RequestBody Usuario usuario){
        repository.update(usuario);
    }

    @GetMapping("/users")
    public List<Usuario> getAll(){
        return repository.listAll();
    }

    @GetMapping("/users/{id}")
    public Usuario getOne(@PathVariable("id") Integer id) {
        return repository.finById(id);
    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.remove(id);
    }
}

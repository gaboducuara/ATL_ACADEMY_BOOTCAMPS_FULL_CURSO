package academy.atl.panel.controllers;

import academy.atl.panel.models.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    // 1 . se crea la variable usuario. ---> static List<Usuario> usuarios
    //2. con la funcion List.of () automaticamente se genera una lista con los usuarios cargados correspondientemente;
    //3. la funcion eliminar usuario... nos elimina un usuario de la lista.

    List<Usuario> usuarios = new ArrayList<>();

    @GetMapping("/api/usuarios")
    public List<Usuario> listarUsuarios() {
        return usuarios;
    }
    @DeleteMapping ("/api/usuarios/{id}")
    public void elimiarUsuario(@PathVariable String id) {

    for (Usuario user : usuarios) {
        if(id.equals(user.getId().toString())){
            usuarios.remove(user);
        }
    }
    }
    
    @PostMapping ("/api/usuarios")
    public void agregarUsuario(@RequestBody Usuario user) {
        usuarios.add(user);
    };
};
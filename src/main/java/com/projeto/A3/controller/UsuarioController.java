package com.projeto.A3.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*; // permite anotações para receber requições
import com.projeto.A3.model.Usuario; // entidade usuario
import com.projeto.A3.repository.UsuarioRepository; // salvar e buscar no bd


@RestController // responde requisições http
@RequestMapping("/usuarios") // define o caminho base da url
public class UsuarioController {
    
    @Autowired // dá acesso ao repository, ao bd 
    private UsuarioRepository usuarioRepository; // guarda nessa variavel
    @PostMapping // quando o usuario fizer um cadastro
    public Usuario cadastrarUsuario (@RequestBody Usuario usuario) {
        return usuarioRepository.save (usuario);
    }  // transforma a requisição num objeto e salva no banco com o id automático 
    
}

package com.example.projetoA3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetoA3.model.Cadastro;
import com.example.projetoA3.model.Login;
import com.example.projetoA3.repository.CadastroRepository;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private CadastroRepository cadastroRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping
    public ResponseEntity<String> login(@RequestBody Login login) {
        Cadastro cadastro = cadastroRepository.findByEmail(login.getEmail());

        if (cadastro == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                 .body("Usuário não encontrado. Cadastre-se primeiro.");
        }
        System.out.println("Senha enviada: " + login.getSenha());
        System.out.println("Senha salva: " + cadastro.getSenha());
        if (passwordEncoder.matches(login.getSenha(), cadastro.getSenha())) {
            return ResponseEntity.ok("Login realizado com sucesso");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                                 .body("Senha incorreta, tente novamente");
        }
        
    }
}

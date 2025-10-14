package com.example.projetoA3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetoA3.model.Cadastro;
import com.example.projetoA3.repository.CadastroRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RestController // para responder requisições http
@RequestMapping("/cadastro") // caminho base da url para métodos da classe 

public class CadastroController {
    @Autowired
    private CadastroRepository cadastroRepository;  // pode ter acesso ao banco de dados no controller
    @PostMapping
    public Cadastro criarCadastro(@RequestBody Cadastro cadastro) {
       
    return cadastroRepository.save(cadastro); // responde a requições de post em cadastro, ou seja, um novo cadastro, salva e retorna o cadastro salvo como resposta
    }
    @GetMapping
    public List<Cadastro> listarCadastros() {
        return cadastroRepository.findAll();
}
    }
    
    


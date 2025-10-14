package com.example.projetoA3.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "cadastro")
@Data
public class Cadastro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private String telefone;

}

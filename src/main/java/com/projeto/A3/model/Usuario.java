package com.projeto.A3.model;
import jakarta.persistence.Entity; // vira tabela no bd
import jakarta.persistence.Id; // chave primária 
import jakarta.persistence.GeneratedValue; // ativa a geração automática
import jakarta.persistence.GenerationType; // tipo de geração, aqui, autoincremento
import jakarta.persistence.Column; // configa os campos como obrigatórios ou unicos, por exemplo

import lombok.Data;

@Entity
@Data
public class Usuario {

    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(nullable = false, unique = true)
   private String email;
   
   @Column(nullable = false)
   private String senha;

   @Column(nullable = false)
   private String nome;

   @Column(nullable = false)
   private String telefone;
}

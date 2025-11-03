package com.projeto.A3.repository;
import org.springframework.data.jpa.repository.JpaRepository; // para salvar, buscar, atualizar e deletar dados no banco — sem precisar escrever código SQL.
import com.projeto.A3.model.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {

}



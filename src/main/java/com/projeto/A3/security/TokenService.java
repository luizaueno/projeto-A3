package com.projeto.A3.security;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;

@Service // um serviço que pode ser injetado em outras partes
public class TokenService {
    private final Key chaveSecreta = Keys.secretKeyFor(SignatureAlgorithm.HS256); // garantir que o token não seja falso
    public String gerarToken(String email) {
        long expiracao = 1000 * 60 * 60;
     // recebe um email e devolve um token que dura 1hora
    return Jwts.builder()
        .setSubject(email)
        .setExpiration(new Date(System.currentTimeMillis() + expiracao)) // quando expira
        .signWith(chaveSecreta)
        .compact();
    }
}
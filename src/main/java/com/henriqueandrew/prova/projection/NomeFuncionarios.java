package com.henriqueandrew.prova.projection;

// @author Henrique Andrew da Silva

import org.springframework.beans.factory.annotation.Value;

public interface NomeFuncionarios {
    
    String getNome();
    
    @Value("#{(target.funcionario.nome)}")
    String getfuncionario();
    
}

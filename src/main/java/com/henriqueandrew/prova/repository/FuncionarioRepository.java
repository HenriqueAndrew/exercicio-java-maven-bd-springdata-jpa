package com.henriqueandrew.prova.repository;

// @author Henrique Andrew da Silva

import com.henriqueandrew.prova.entity.Funcionario;
import com.henriqueandrew.prova.projection.FuncionariosTotal;
import com.henriqueandrew.prova.projection.NomeFuncionarios;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
    
    NomeFuncionarios findFuncionarioByNome(String nome);
    
    @Query("select count(f.nome) as total"
            + " from Funcionario f")
    
    List<FuncionariosTotal> findByFuncionariosTotal();

}

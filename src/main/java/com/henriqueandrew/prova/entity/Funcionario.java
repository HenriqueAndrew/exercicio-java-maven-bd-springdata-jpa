package com.henriqueandrew.prova.entity;

// @author Henrique Andrew da Silva

import javax.persistence.Entity;
import javax.persistence.*;
import org.springframework.data.jpa.domain.AbstractPersistable;


@Entity
@Table(name = "FUNCIONARIOS")
public class Funcionario extends AbstractPersistable<Long>{

    @Id
    private Long idFuncionario;    
    
    @Column(name = "Nome", length = 64, nullable = false)
    private String nome;
    
    @Column(name = "Sexo", length = 2, nullable = false)
    private String sexo;
    
    @Column(name = "Telefone", length = 16, nullable = false)
    private String telefone;
    
    @ManyToOne
    @JoinColumn(name = "cargo_id", nullable = false)
    private Cargo cargo;
   
    public Long getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Long idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    
}

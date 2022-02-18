package com.henriqueandrew.prova.entity;

// @author Henrique Andrew da Silva

import java.util.List;
import javax.persistence.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "CARGOS")
public class Cargo extends AbstractPersistable {

    @Id
    private Long idCargo;
    
    @Column(name = "Cargo", length = 32, nullable = false)
    private String cargo;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cargo")
    private List<Funcionario> funcs; 

    public Long getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Long idCargo) {
        this.idCargo = idCargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    } 

    public List<Funcionario> getFuncs() {
        return funcs;
    }

    public void setFuncs(List<Funcionario> funcs) {
        this.funcs = funcs;
    }       

}

package com.henriqueandrew.prova.service;

// @author Henrique Andrew da Silva
import com.henriqueandrew.prova.entity.Cargo;
import com.henriqueandrew.prova.repository.CargoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CargoService {

    @Autowired
    private CargoRepository repositoryCargo;

    public void salvar(Cargo cargo) {
        repositoryCargo.save(cargo);
    }
    
    public void deletar(Cargo cargo){
        repositoryCargo.delete(cargo);
    }
    
    public Optional<Cargo> buscaPorId(Long id) {
        return repositoryCargo.findById(id);
    }

    public List<Cargo> buscarTodos() {
        return repositoryCargo.findAll();
    }

    public void saveCargo() {

        //CargoService objCargo = new CargoService();

        Cargo cargo1 = new Cargo();
        Cargo cargo2 = new Cargo();
        Cargo cargo3 = new Cargo();

        cargo1.setCargo("Coordenador");
        cargo2.setCargo("Administrativo");
        cargo3.setCargo("Programador");
        
        salvar(cargo1);
        salvar(cargo2);
        salvar(cargo3);

        //objCargo.repositoryCargo.save(cargo1);
        //objCargo.repositoryCargo.save(cargo2);
        //objCargo.repositoryCargo.save(cargo3);

    }
    
    public void alterCargo(Cargo cargo, String nome){
        
        cargo.setCargo(nome);
        salvar(cargo);
        //repositoryFuncionario.save(funcionario);
    }
    
    public void deleteCargo(Cargo cargo){
        
        cargo.getCargo();
        deletar(cargo);          
    }

}

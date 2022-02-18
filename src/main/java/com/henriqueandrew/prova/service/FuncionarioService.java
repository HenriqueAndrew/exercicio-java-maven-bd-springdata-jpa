package com.henriqueandrew.prova.service;

// @author Henrique Andrew da Silva
import com.henriqueandrew.prova.entity.Cargo;
import com.henriqueandrew.prova.entity.Funcionario;
//import com.henriqueandrew.prova.repository.CargoRepository;
import com.henriqueandrew.prova.repository.FuncionarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

@Service
public class FuncionarioService {  

    @Autowired
    private FuncionarioRepository repositoryFuncionario;
    
    //@Autowired
    //private CargoRepository cargoRepository;
    
    //@Autowired
    //private FuncionarioService funcionarioRepository;    
    

    public void salvar(Funcionario funcionario) {
        repositoryFuncionario.save(funcionario);
    }
    
    public void deletar(Funcionario funcionario){
        repositoryFuncionario.delete(funcionario);
    }

    public Optional<Funcionario> buscaPorId(Long id) {
        return repositoryFuncionario.findById(id);
    }

    public List<Funcionario> buscarTodos() {
        return repositoryFuncionario.findAll();
    }
        
    public void saveFuncionario(Cargo cargo){
        
        //FuncionarioService objFunc = new FuncionarioService();
        
        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario();
        Funcionario func3 = new Funcionario();
                
        func1.setNome("Adriano");
        func1.setSexo("Masculino");
        func1.setTelefone("16 99999999");
        func1.setCargo(cargo);
        
        func2.setNome("Beatriz");
        func2.setSexo("Feminino");
        func2.setTelefone("16 88888888");
        func2.setCargo(cargo);
        
        func3.setNome("Carlos");
        func3.setSexo("Masculino");
        func3.setTelefone("16 77777777");
        func3.setCargo(cargo);
        
        salvar(func1);
        salvar(func2);
        salvar(func3);
        
        //repositoryFuncionario.save(func1);
        //repositoryFuncionario.save(func2);
        //repositoryFuncionario.save(func3);
        
        //objFunc.salvar(func1);
        //objFunc.salvar(func2);
        //objFunc.salvar(func3);
    }
    
    public void alterFuncionario(Funcionario funcionario, Cargo cargo){
        
        funcionario.setCargo(cargo);
        salvar(funcionario);
        //repositoryFuncionario.save(funcionario);
    }
    
    public void deleteFuncionario(Funcionario funcionario){
        
        funcionario.getNome();
        deletar(funcionario);          
    }
    
    public void listaFuncionarios(){        
        buscarTodos();
    }
    
    /*@Transactional(readOnly = false)
    public void salvar(Cargo cargo, Funcionario funcionario) {
        cargoRepository.save(cargo);
        funcionario.setCargo(cargo);
        funcionarioRepository.salvar(funcionario);
    }*/
    
}

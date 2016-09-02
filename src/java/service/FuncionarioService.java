/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;


import Model.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;

/**
 *
 * @author AlexSousa
 */
@ManagedBean
@ApplicationScoped
public class FuncionarioService {
    
    
    
    List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    /**
     * Creates a new instance of ProdutoService
     */
    public FuncionarioService() {
        
        
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    

    
    
}

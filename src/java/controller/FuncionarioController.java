/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Funcionario;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import service.FuncionarioService;

/**
 *
 * @author AlexSousa
 */
@ManagedBean
@ViewScoped
public class FuncionarioController {

    @ManagedProperty("#{funcionarioService}")
    private FuncionarioService funcionarioService;
    private Funcionario funcionario = new Funcionario();
    private List<Funcionario> funcionarios;

    

    @PostConstruct
    public void init() {
        funcionarios = funcionarioService.getFuncionarios();
    }

    public void cadastrar() {
        
        funcionarios.add(funcionario);
        funcionario = new Funcionario();
    }

    public FuncionarioService getFuncionarioService() {
        return funcionarioService;
    }

    public void setFuncionarioService(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    
    /**
     * Creates a new instance of ProdutoController
     */
    public FuncionarioController() {
    }

}

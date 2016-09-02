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

    private List<Funcionario> funcionarios;

    private Integer codigo; 
    private String nome;
    private String email;
    private Date dataNasc;
    private Double comissao;
    private Double salario;

    @PostConstruct
    public void init() {
        funcionarios = funcionarioService.getFuncionarios();
    }

    public void cadastrar() {
        Funcionario f1 = new Funcionario();
        f1.setCodigo(codigo);
        f1.setNome(nome);
        f1.setEmail(email);
        f1.setDataNasc(dataNasc);
        f1.setComissao(comissao);
        f1.setSalario(salario);
        funcionarios.add(f1);
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    
    public FuncionarioService getFuncionarioService() {
        return funcionarioService;
    }

    public void setFuncionarioService(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    public List<Funcionario> getFuncionario() {
        return funcionarios;
    }

    public void setFuncionario(List<Funcionario> funcionario) {
        this.funcionarios = funcionario;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    
    /**
     * Creates a new instance of ProdutoController
     */
    public FuncionarioController() {
    }

}

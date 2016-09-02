/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author AlexSousa
 */
@ManagedBean
@RequestScoped
public class MainController {

    private Integer n1, n2;
    String operacao, resultado;
    private Map<String, String> operacoes;

    public Map<String, String> getOperacoes() {
        return operacoes;
    }

    public void setOperacoes(Map<String, String> operacoes) {
        this.operacoes = operacoes;
    }

    public Integer getN1() {
        return n1;
    }

    public void setN1(Integer n1) {
        this.n1 = n1;
    }

    public Integer getN2() {
        return n2;
    }

    public void setN2(Integer n2) {
        this.n2 = n2;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public void limpar() {
        this.n1 = 0;
        this.n2 = 0;
        this.resultado = null;
        this.operacao = "";
    }

    public void comparar() {
        if (n1 > n2) {
            resultado = "n1 é maior que n2";
        } else if (n1 < n2) {
            resultado = "n2 é maior que n1";
        } else {
            resultado = "Números iguais.";
        }
    }

    public void somar() {
        resultado = String.valueOf(n1 + n2);
    }

    public void subtrair() {
        resultado = String.valueOf(n1 - n2);
    }

    public void multiplicar() {
        resultado = String.valueOf(n1 * n2);
    }

    public void dividir() {
        if (n2 == 0) {
            resultado = "Não é possível dividir por zero";
        } else {
            resultado = String.valueOf(n1 / n2);
        }

    }

    @PostConstruct
    public void init() {
        operacoes = new LinkedHashMap<String, String>();
        operacoes.put("+", "soma");
        operacoes.put("-", "subtracao");
        operacoes.put("*", "multiplicacao");
        operacoes.put("/", "divisao");
    }

    public void executa() {
        switch (operacao) {
            case "soma":
                somar();
                break;
            case "subtracao":
                dividir();
                break;
            case "multiplicacao":
                multiplicar();
                break;
            case "divisao":
                dividir();
                break;
            default:
                resultado = null;
        }
    }

    /**
     * Creates a new instance of MainController
     */
    public MainController() {
        this.n1 = 0;
        this.n2 = 0;
        this.resultado = null;
    }

    
}

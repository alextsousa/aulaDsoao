/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author AlexSousa
 */
@ManagedBean
@RequestScoped
public class Aula03 {

    private String console;
    private String mensagem;

    private String nome;
    private String email;
    private String curso;
    private String msg;

    private boolean alg;
    private boolean dsoo;
    private boolean poo;

    public void imprimeSelecao() {
        mensagem = "Você Selecionou " + console;
    }

    public void cadastra() {
        msg = "Nome: " + this.nome
                + " email: " + this.email;
        if (alg && dsoo && poo) {
            msg += " Cursos: ";
        }else{
            msg += " Nenhum curso selecionado.";
        }
        
        if (alg) {
            msg += " Algoritimo";
        }
        
        if (dsoo) {
            msg += "D.S.O.O.";
        }
        
        if (poo) {
            msg += "P.O.O.";
        }
                
    }

    public boolean isAlg() {
        return alg;
    }

    public void setAlg(boolean alg) {
        this.alg = alg;
    }

    public boolean isDsoo() {
        return dsoo;
    }

    public void setDsoo(boolean dsoo) {
        this.dsoo = dsoo;
    }

    public boolean isPoo() {
        return poo;
    }

    public void setPoo(boolean psoo) {
        this.poo = psoo;
    }

    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    /**
     * Creates a new instance of Aula03
     */
    public Aula03() {
    }

}

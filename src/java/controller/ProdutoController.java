/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Produto;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import service.ProdutoService;

/**
 *
 * @author AlexSousa
 */
@ManagedBean
@ViewScoped
public class ProdutoController {

    @ManagedProperty("#{produtoService}")
    private ProdutoService produtoService;

    private List<Produto> produtos;

    private Integer codigo;
    private String desc;
    private Double preco;

    @PostConstruct
    public void init() {
        produtos = produtoService.getProdutos();
    }

    public void cadastrar() {
        Produto p = new Produto();
        p.setCodigo(codigo);
        p.setDescricao(desc);
        p.setPreco(preco);

        produtos.add(p);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public ProdutoService getProdutoService() {
        return produtoService;
    }

    public void setProdutoService(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    

    /**
     * Creates a new instance of ProdutoController
     */
    public ProdutoController() {
    }

}

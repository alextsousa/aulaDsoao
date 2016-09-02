/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Model.Produto;
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
public class ProdutoService {
    List<Produto> produtos = new ArrayList<Produto>();
    /**
     * Creates a new instance of ProdutoService
     */
    public ProdutoService() {
        Produto p1 = new Produto();
        p1.setCodigo(20);
        p1.setDescricao("Teclado");
        p1.setPreco(19.99);
        Produto p2 = new Produto();
        p2.setCodigo(100);
        p2.setDescricao("Mouse");
        p2.setPreco(9.99);
        produtos.add(p1);
        produtos.add(p2);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    
}

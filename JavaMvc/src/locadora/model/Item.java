/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Set;
import locadora.dao.ItemDAO;

/**
 *
 * @author Usuario
 */
public class Item   {
    private Integer codItem;
    private double preco;
    private String tipo;
    private Date dataLocacao;
    private Date dateDevolucao;
    private Filme filme;
    private Cliente cliente;

    public Item() {
    }

    public Item(Integer codItem, double preco, String tipo, Date dataLocacao, Date dateDevolucao, Filme filme, Cliente cliente) {
        this.codItem = codItem;
        this.preco = preco;
        this.tipo = tipo;
        this.dataLocacao = dataLocacao;
        this.dateDevolucao = dateDevolucao;
        this.filme = filme;
        this.cliente = cliente;
    }

    public Item(Filme filme, String tipo,Double preco) {
        this.filme = filme;
        this.tipo = tipo;
        this.preco = preco;
    }

    public Item(Integer codItem,Filme filme,String tipo,Double preco,Cliente cliente) {
        this.codItem = codItem;
        this.filme = filme;
        this.tipo = tipo;
        this.preco = preco;
        this.cliente = cliente;
    }

    public Item(Integer codItem, String tipo, Double preco) {
        this.codItem = codItem;
        this.tipo = tipo;
        this.preco = preco;
    }

    public Item(Integer codItem, Integer codCliente) {
        this.codItem = codItem;
        cliente = new Cliente(codCliente);
    }
    
    public Item(Integer codItem,Cliente cliente,Date dataLocacao,Date dataDevolucao,Filme filme,Double preco){
        this.codItem = codItem;
        this.cliente = cliente;
        this.dataLocacao = dataLocacao;
        this.dateDevolucao = dataDevolucao;
        this.filme = filme;
        this.preco = preco;
    }
    
    public Item(Integer codItem,Filme filme,Cliente cliente,Date dataDevolucao){
        this.codItem = codItem;
        this.filme = filme;
        this.cliente = cliente;
        this.dateDevolucao = dataDevolucao;
    }

    public Integer getCodItem() {
        return codItem;
    }

    public double getPreco() {
        return preco;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public Date getDateDevolucao() {
        return dateDevolucao;
    }

    public Filme getFilme() {
        return filme;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCodItem(Integer codItem) {
        this.codItem = codItem;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public void setDateDevolucao(Date dateDevolucao) {
        this.dateDevolucao = dateDevolucao;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void cadastrarItem(Item item){
        new ItemDAO().cadastrarItem(item);
    }
    public ArrayList<Item> consultaItens(String titulo){
        return new ItemDAO().consultaItens(titulo);
    }
    
    public boolean atualizaItem(Item item){
        return new ItemDAO().atualizarItem(item);
    }
    
    public boolean deletarItem(Integer id){
        return new ItemDAO().deletarItem(id);
    }
    
    public boolean registrarItem(Set<Item> item){
        return new ItemDAO().registraItem(item);
    }
    
    public ArrayList<Item> consultaItensAlugados(String nomeCliente,String titulo){
      return new ItemDAO().consultaItensAlugados(nomeCliente, titulo);
    }
    
    public boolean baixaItem(Integer codItem){
        return new ItemDAO().baixaItem(codItem);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.codItem);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        return Objects.equals(this.codItem, other.codItem);
    }

   
}

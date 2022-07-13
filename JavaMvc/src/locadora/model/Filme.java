/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.model;

import java.util.ArrayList;
import locadora.dao.ExceptionDAO;
import locadora.dao.FilmeDAO;

/**
 *
 * @author Usuario
 */
public class Filme {
    private Integer codFilme;
    private String titulo;
    private String genero;
    private String sinopse;
    private Integer duracao;
    private ArrayList<Item> itens = new ArrayList<>();
    private ArrayList<Ator> atores = new ArrayList<>(); 

    public Filme(String titulo, String genero, String sinopse, Integer duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopse = sinopse;
        this.duracao = duracao;
    }

    public Filme(Integer codFilme, String titulo, String genero, String sinopse, Integer duracao) {
        this.codFilme = codFilme;
        this.titulo = titulo;
        this.genero = genero;
        this.sinopse = sinopse;
        this.duracao = duracao;
    }
    
    public Filme(){
        
    }
    
    public Filme(Integer codFilme,String titulo){
        this.titulo = titulo;
        this.codFilme = codFilme;
    }
    
    

    public Integer getCodFilme() {
        return codFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public ArrayList<Ator> getAtores() {
        return atores;
    }

    public void setCodFilme(Integer codFilme) {
        this.codFilme = codFilme;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public void setAtores(ArrayList<Ator> atores) {
        this.atores = atores;
    }
    
    
    
    public void cadastrarFilme(Filme filme)throws ExceptionDAO{
        new FilmeDAO().cadastrarFilme(filme);
    }
    
    public ArrayList<Filme> consultarFilme(String titulo){
        return new FilmeDAO().listarFilme(titulo);
    }
    
    public void atualizarFilme(Filme filme){
        new FilmeDAO().atualizarFilme(filme);
    }
    
    public void apagarFilme(Integer id){
        new FilmeDAO().apagarFilme(id);
    }
}

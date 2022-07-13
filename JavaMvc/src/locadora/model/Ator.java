/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.model;

import java.util.ArrayList;
import locadora.dao.AtorDAO;
import locadora.dao.ExceptionDAO;

/**
 *
 * @author Usuario
 */
public class Ator {
    private Integer codAtor;
    private String name;
    private String nacionalidade;
    private ArrayList<Filme> filmes = new ArrayList<>();

    public Ator() {
    }

    public Ator(String name, String nacionalidade) {
        this.name = name;
        this.nacionalidade = nacionalidade;
    }

    public Ator(Integer codAtor, String name, String nacionalidade) {
        this.codAtor = codAtor;
        this.name = name;
        this.nacionalidade = nacionalidade;
    }
    
    

    public Integer getCodAtor() {
        return codAtor;
    }

    public String getName() {
        return name;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public ArrayList<Filme> getFilmes() {
        return filmes;
    }

    public void setCodAtor(Integer codAtor) {
        this.codAtor = codAtor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setFilmes(ArrayList<Filme> filmes) {
        this.filmes = filmes;
    }
    
    public void cadastraAtor(Ator ator)throws ExceptionDAO{
        new AtorDAO().cadastrarAtor(ator);
    }
    
    public ArrayList<Ator> consultaAtor(String nome){
       return new AtorDAO().consultaAtor(nome);
    }
    
    public void atualizarAtor(Ator ator){
        new AtorDAO().atualizaAtor(ator);
    }
    
    public void apagarAtor(Ator ator){
        new AtorDAO().apagarAtor(ator);
    }
}

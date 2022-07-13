/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.controller;

import java.util.ArrayList;
import locadora.dao.ExceptionDAO;
import locadora.model.Ator;

/**
 *
 * @author Usuario
 */
public class AtorController {
    public boolean cadastraAtor(String nome,String nacionalidade)throws ExceptionDAO{
        if(nome!=null && nome.length()>0 && nacionalidade!=null && nacionalidade.length()>0){
            Ator ator = new Ator(nome,nacionalidade);
            ator.cadastraAtor(ator);
            return true;
        }
        else
            return false;
    }
    
    public ArrayList<Ator> consultaFilmes(String nome){
        return new Ator().consultaAtor(nome);
    }
    
    public boolean atualizarAtor(Integer cod,String nome,String nacionalidade){
        if(nome!=null && nome.length()>0 && nacionalidade!=null && nacionalidade.length()>0){
            Ator ator = new Ator(cod,nome,nacionalidade);
            ator.atualizarAtor(ator);
            return true;
        }
        return false;
    }
    
    public boolean apagarAtor(Integer id){
        if(id!=0){
            Ator ator = new Ator();
            ator.setCodAtor(id);
            ator.apagarAtor(ator);
            return true;
    }
        return false;
    }
}

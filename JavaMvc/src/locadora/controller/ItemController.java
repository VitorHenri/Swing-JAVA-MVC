/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.controller;

import java.util.ArrayList;
import locadora.model.Filme;
import locadora.model.Item;

/**
 *
 * @author Usuario
 */
public class ItemController {
    public boolean cadastrarItem(Integer codFilme,String titulo,String tipo,Double preco){
        if(codFilme>0 && codFilme!=null && titulo.length()>0 && titulo!=null && preco>0 && preco!=null){
            Item item = new Item(new Filme(codFilme,titulo),tipo,preco);
            item.cadastrarItem(item);
            return true;
    }
        return false;
    }
    
    
    public ArrayList<Item> consultaItem(String titulo){
        return new Item().consultaItens(titulo);
    }
}

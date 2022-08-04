/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import locadora.model.Cliente;
import locadora.model.Filme;
import locadora.model.Item;

/**
 *
 * @author Usuario
 */
public class AlugarController {
    public Set<Item> adicionarItens(Integer codItem,Integer codCliente,Date dataLocacao,Date dataDevolucao,Set<Item> itensLista,String titulo,Double preco){
       if(codItem!=null && codCliente!=null){
       itensLista.add(new Item(codItem,new Cliente(codCliente),dataLocacao,dataDevolucao,new Filme(titulo),preco));
       return itensLista;
       }else{
           return null;
       }
       
    }
    
    
    public boolean registrarVenda(Set<Item> itens){
        if(itens!=null){
            return new Item().registrarItem(itens);
        }
        return false;
    }
    
    
}

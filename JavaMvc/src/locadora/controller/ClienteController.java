/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.controller;

import java.util.ArrayList;
import java.util.Date;
import locadora.model.Cliente;

/**
 *
 * @author Usuario
 */
public class ClienteController {
    public boolean cadastraCliente(String nome,String cpf,String email,String endereco, Date dtNascimento){
        if(nome != null && nome.length()>0 && cpf != null && cpf.length()>0 && email != null && endereco != null && endereco.length()>0 && dtNascimento!= null) {
            Cliente cliente = new Cliente(nome,cpf,email,endereco,dtNascimento);
            cliente.cadastrarCliente(cliente);
            return true;
        }else return false;
    }
    
    public ArrayList<Cliente> consultaCliente(String nome){
            return new Cliente().consultaClientes(nome);
        
        
    }
    
    public boolean atualizaCliente(Integer id,String nome,String cpf,String email,String endereco, Date dtNascimento){
        if(nome != null && nome.length()>0 && cpf != null && cpf.length()>0 && email != null && endereco != null && endereco.length()>0 && dtNascimento!= null) {
            Cliente cliente = new Cliente(id,nome,cpf,email,endereco,dtNascimento);
            cliente.atualizaCliente(cliente);
            return true;
        }else 
            return false;
    }
    
    public boolean apagarCliente(Integer id){
        if(id!=0){
            Cliente cliente = new Cliente();
            cliente.setCodCliente(id);
            cliente.apagarCliente(cliente);
            return true;
        }
        return false;
    }
}

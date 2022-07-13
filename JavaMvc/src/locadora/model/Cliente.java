/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.model;

import java.util.ArrayList;
import java.util.Date;
import locadora.dao.ClienteDAO;

/**
 *
 * @author Usuario
 */
public class Cliente {
    private Integer codCliente;
    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private Date dNascimento;
    private ArrayList<Item> itens = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String email, String endereco, Date dNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.dNascimento = dNascimento;
    }

    public Cliente(Integer codCliente, String nome, String cpf, String email, String endereco, Date dNascimento) {
        this.codCliente = codCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.dNascimento = dNascimento;
    }
    
    

    public Integer getCodCliente() {
        return codCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public Date getdNascimento() {
        return dNascimento;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setdNascimento(Date dNascimento) {
        this.dNascimento = dNascimento;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
    
    public void cadastrarCliente(Cliente cliente){
        new ClienteDAO().cadastrarCliente(cliente);
    }
    
    public ArrayList<Cliente> consultaClientes(String nome){
        return new ClienteDAO().consultarCliente(nome);
    }
    
    public void atualizaCliente(Cliente cliente){
        new ClienteDAO().atualizarCliente(cliente);
    }
    
    public void apagarCliente(Cliente cliente){
        new ClienteDAO().apagarCliente(cliente);
    }
}

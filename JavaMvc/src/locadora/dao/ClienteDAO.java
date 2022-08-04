/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.dao;

import locadora.model.Cliente;
import java.sql.Connection;
import locadora.DB.DB;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
/**
 *
 * @author Usuario
 */
public class ClienteDAO {
    
    Connection conn = null;
    public void cadastrarCliente(Cliente cliente){
        String sql = "insert into cliente (nome,cpf,email,endereco,dtnascimento) values(?,?,?,?,?)";
        PreparedStatement pstm = null;
        try{
            conn = DB.createConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getCpf());
            pstm.setString(3, cliente.getEmail());
            pstm.setString(4, cliente.getEndereco());
            pstm.setDate(5, new java.sql.Date(cliente.getdNascimento().getTime()));
            pstm.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            DB.closeConnection(null, pstm, conn);
        }
    }
    
    public ArrayList<Cliente> consultarCliente(String nome){
        String sql = nome.length()>0?"select * from cliente where nome ilike '"+nome+"%'":"select * from cliente";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        try{
        conn = DB.createConnection();
        pstm = conn.prepareStatement(sql);
        rs = pstm.executeQuery();
        if(rs!=null){
            while(rs.next()){
                clientes.add(new Cliente(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDate(6)));
            }
        }
        
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            DB.closeConnection(rs, pstm, conn);
        }
        return clientes;
    }
    
    public void atualizarCliente(Cliente cliente){
        PreparedStatement pstm = null;
        String sql = "update cliente set nome=?,cpf=?,email=?,endereco=?,dtnascimento=? where id=?";
        try{
            conn = DB.createConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getCpf());
            pstm.setString(3, cliente.getEmail());
            pstm.setString(4, cliente.getEndereco());
            pstm.setDate(5, new java.sql.Date(cliente.getdNascimento().getTime()));
            pstm.setInt(6, cliente.getCodCliente());
            pstm.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            DB.closeConnection(null, pstm, conn);
        }
    }
    
    public void apagarCliente(Cliente cliente){
        PreparedStatement pstm = null;
        String sql = "delete from cliente where id="+cliente.getCodCliente();
        
        try{
            conn = DB.createConnection();
            pstm =  conn.prepareStatement(sql);
            pstm.executeUpdate();
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            DB.closeConnection(null, pstm, conn);
        }
    }
}

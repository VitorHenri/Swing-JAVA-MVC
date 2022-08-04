/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.dao;

import locadora.model.Item;
import java.sql.Connection;
import java.sql.PreparedStatement;
import locadora.DB.DB;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Set;
import locadora.model.Cliente;
import locadora.model.Filme;

/**
 *
 * @author Usuario
 */
public class ItemDAO {
    Connection conn=null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    String sql=null;
    public boolean cadastrarItem(Item item){
        try{
            conn = DB.createConnection();
            sql = "insert into item (codFilme,tipo,preco) values(?,?,?)";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, item.getFilme().getCodFilme());
            pstm.setString(2, item.getTipo());
            pstm.setDouble(3, item.getPreco());
            pstm.executeUpdate();
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            DB.closeConnection(rs, pstm, conn);
        }
        return false;
    }
    
    public ArrayList<Item> consultaItens(String titulo){
        ArrayList<Item> itens = new ArrayList<>();
        try{
            sql = (titulo.length()==0||titulo==null)?"select i.coditem,i.codfilme,f.titulo,i.tipo,i.preco,i.codcliente from item i left join filme f on f.id=i.codfilme ":"select i.coditem,i.codfilme,f.titulo,i.tipo,i.preco,i.codcliente from item i left join filme f on f.id=i.codfilme"
                  +" where f.titulo ilike '"+titulo+"%'";
            conn = DB.createConnection();
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            if(rs!=null){
                while(rs.next()){
                    itens.add(new Item(rs.getInt(1),new Filme(rs.getInt(2),rs.getString(3)),rs.getString(4),rs.getDouble(5),new Cliente(rs.getInt(6))));
                }
            }
            }catch(Exception e){
                e.printStackTrace();
            }finally{
            DB.closeConnection(rs, pstm, conn);
        }
            return itens;
        
    
    }
    
    public boolean atualizarItem(Item item){
        try{
            conn = DB.createConnection();
            sql = "update item set tipo=?,preco=? where codItem=?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, item.getTipo());
            pstm.setDouble(2, item.getPreco());
            pstm.setInt(3, item.getCodItem());
            pstm.executeUpdate();
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            DB.closeConnection(rs, pstm, conn);
        }
        return false;
    }
    
    public boolean deletarItem(Integer id){
        try{
        conn = DB.createConnection();
        sql = "delete from item where codItem="+id;
        pstm = conn.prepareStatement(sql);
        pstm.executeUpdate();
        return true;
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            DB.closeConnection(rs, pstm, conn);
        }
        return false;
    }
    
    public boolean registraItem(Set<Item> itens){
        try{
            conn = DB.createConnection();
            sql = "update item set codcliente = ?, datalocacao = ?,datadevolucao = ? where coditem = ?";
            
            itens.forEach((Item item)->{
                try{
                pstm = conn.prepareStatement(sql);
                pstm.setInt(1, item.getCliente().getCodCliente());
                pstm.setDate(2, new java.sql.Date(item.getDataLocacao().getTime()));
                pstm.setDate(3, new java.sql.Date(item.getDateDevolucao().getTime()));
                pstm.setInt(4, item.getCodItem());
                pstm.executeUpdate();
                }catch(Exception e){
                    e.printStackTrace();
                }
                
            });
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            DB.closeConnection(rs, pstm, conn);
        }
        return false;
    }
    
    public ArrayList<Item> consultaItensAlugados(String nomeCliente,String titulo){
        ArrayList<Item> itens = new ArrayList<>();
        StringBuilder sqlD = new StringBuilder();
        sqlD.append("select i.coditem,f.titulo,i.codcliente,c.nome,i.datadevolucao from item i inner join cliente c on i.codcliente=c.id inner join filme f on f.id=i.codfilme");
        if(nomeCliente.length()>0 && nomeCliente!=null && titulo.length()>0 && titulo!=null ){
            sqlD.append(" where c.nome ilike '"+nomeCliente+"%' and f.titulo ilike '"+titulo+"%'");
        }else if(nomeCliente.length()==0 && titulo.length()>0){
             sqlD.append(" where f.titulo ilike '"+titulo+"%'");
        }else if(titulo.length()==0 && nomeCliente.length()>0){
            sqlD.append(" where c.nome ilike '"+nomeCliente+"%'");
        }
        
        try{
            conn = DB.createConnection();
            sql = sqlD.toString();
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            if(rs!=null){
                while(rs.next()){
                    itens.add(new Item(rs.getInt(1),new Filme(rs.getString(2)),new Cliente(rs.getInt(3),rs.getString(4)),rs.getDate(5)));
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            DB.closeConnection(rs, pstm, conn);
        }
        return itens;
    }
    
    public boolean baixaItem(Integer codItem){
        try{
            conn = DB.createConnection();
            sql = "update item set codcliente=null,datalocacao=null,datadevolucao=null where coditem="+codItem;
            pstm = conn.prepareStatement(sql);
            pstm.execute();
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            DB.closeConnection(rs, pstm, conn);
        }
        return false;
    }
}
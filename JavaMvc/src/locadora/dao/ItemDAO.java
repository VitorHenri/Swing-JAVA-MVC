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
            try{
                conn.close();
                pstm.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return false;
    }
    
    public ArrayList<Item> consultaItens(String titulo){
        ArrayList<Item> itens = new ArrayList<>();
        try{
            sql = (titulo.length()==0||titulo==null)?"select i.coditem,i.codfilme,f.titulo,i.tipo,i.preco from item i left join filme f on f.id=i.codfilme ":"select i.coditem,i.codfilme,f.titulo,i.tipo,i.preco from item i left join filme f on f.id=i.codfilme"
                  +" where f.titulo ilike '"+titulo+"%'";
            conn = DB.createConnection();
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            if(rs!=null){
                while(rs.next()){
                    itens.add(new Item(rs.getInt(1),new Filme(rs.getInt(2),rs.getString(3)),rs.getString(4),rs.getDouble(5)));
                }
            }
            }catch(Exception e){
                e.printStackTrace();
            }
            return itens;
        
    
    }
}
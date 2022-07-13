/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.dao;

import java.sql.Connection;
import locadora.DB.DB;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import locadora.model.Ator;
import java.sql.ResultSet;
/**
 *
 * @author Usuario
 */
public class AtorDAO {
    
    Connection conn = null;
    
    public void cadastrarAtor(Ator ator)throws ExceptionDAO{
        String sql = "insert into ator (nome,nacionalidade) values (?,?)";
        PreparedStatement pstm = null;
        
        try{
            conn = DB.createConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, ator.getName());
            pstm.setString(2, ator.getNacionalidade());
            pstm.executeUpdate();
        }catch(Exception e){
            throw new ExceptionDAO("Erro ao cadastrar");
        }finally{
            
            try{
            if(pstm!= null && conn!=null){
                pstm.close();
                conn.close();
            }
            }catch(Exception e){
                
            }
        }
    }
    
    public ArrayList<Ator> consultaAtor(String nome){
        ArrayList<Ator> atores = new ArrayList<>();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try{
            conn = DB.createConnection();
            String sql = nome.length()>0?"select * from ator where nome ilike '"+nome+"%'":"select * from ator";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            if(rs!=null){
                while(rs.next()){
                    atores.add(new Ator(rs.getInt("id"),rs.getString("nome"),rs.getString("nacionalidade")));
            }
        }
        }catch(Exception e){
           e.printStackTrace();
        }finally{
            try{
                pstm.close();
                rs.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
      return atores;
    }
    
    public void atualizaAtor(Ator ator){
        
       PreparedStatement pstm = null;
       String sql = "update ator set nome=?,nacionalidade=? where id=? ";
       try{
        conn = DB.createConnection();
        pstm = conn.prepareStatement(sql);
        pstm.setString(1, ator.getName());
        pstm.setString(2, ator.getNacionalidade());
        pstm.setInt(3, ator.getCodAtor());
        pstm.executeUpdate();
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
    }
    
    public void apagarAtor(Ator ator){
        PreparedStatement pstm = null;
        String sql = "delete from ator where id="+ator.getCodAtor();
        try{
            conn = DB.createConnection();
            pstm = conn.prepareStatement(sql);
            pstm.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.dao;

import locadora.model.Filme;
import java.sql.PreparedStatement;
import locadora.DB.DB;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class FilmeDAO {
    Connection conn = null;
    
    public void cadastrarFilme(Filme filme)throws ExceptionDAO{
        String sql = "insert into filme (titulo,genero,sinopse,duracao) values (?,?,?,?)";
        PreparedStatement pstm = null;
        
        try{
            conn = DB.createConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, filme.getTitulo());
            pstm.setString(2, filme.getGenero());
            pstm.setString(3, filme.getSinopse());
            pstm.setInt(4,filme.getDuracao());
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
    
    public ArrayList<Filme> listarFilme(String nome){
        String sql = nome.length()>0?"select * from filme where titulo ilike '"+nome+"%'":"select * from filme";
        ArrayList<Filme> filmes = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try{
            conn = DB.createConnection();
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            if(rs!=null){
                filmes = new ArrayList<>();
                while(rs.next()){
                    Filme filme = new Filme(rs.getInt("id"),rs.getString("titulo"),rs.getString("genero"),rs.getString("sinopse"),rs.getInt("duracao"));
                    filmes.add(filme);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Nenhum valor foi encontrado");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao consultar valor");
        }finally{
            try{
            pstm.close();
            rs.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return filmes;
    }
    
    public void atualizarFilme(Filme filme){
        conn = DB.createConnection();
        PreparedStatement pstm = null;
        String sql = "update filme set titulo=?,genero=?,sinopse=?,duracao=? where id=?";
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, filme.getTitulo());
            pstm.setString(2, filme.getGenero());
            pstm.setString(3, filme.getSinopse());
            pstm.setInt(4, filme.getDuracao());
            pstm.setInt(5, filme.getCodFilme());
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
    
    public void apagarFilme(Integer id){
        PreparedStatement pstm = null;
        String sql = "delete from filme where id="+id;
        try{
            conn = DB.createConnection();
            pstm = conn.prepareStatement(sql);
            pstm.executeUpdate();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

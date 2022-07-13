/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.DB;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Usuario
 */
public class DB {
    
    
    public static Connection createConnection(){
        Connection conn =null;
            try{
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/MVC","postgres","123");
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            return conn;
        }
        
}


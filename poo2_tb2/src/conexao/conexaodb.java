/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edvar
 */
public class conexaodb {
    
    private static final String driver ="com.mysql.jdbc.Driver"; 
    private static final String url ="jdbc:mysql://localhost:3306/barbearia";
    private static final String usuario ="root";
    private static final String senha ="";
    
    public static Connection getConnection(){
        
        
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url, usuario, senha);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexao:", ex);
        }
    }
    
    public static void closeConnection(Connection con){

            try {
                if(con!=null){
                con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(conexaodb.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    public static void closeConnection(Connection con, PreparedStatement stmt){
        
        closeConnection(con);

            try {
                if(stmt !=null){
                stmt.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(conexaodb.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        
        closeConnection(con, stmt);

            try {
                if(rs !=null){
                rs.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(conexaodb.class.getName()).log(Level.SEVERE, null, ex);
            }
    
}
    
}

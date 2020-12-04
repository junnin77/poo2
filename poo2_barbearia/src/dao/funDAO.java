/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.conexaodb;
import controle.fun;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author edvar
 */
public class funDAO {
    
    public void create(fun f){
        
        Connection con = conexaodb.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO funcionarios(nome, telefone, endereco, cep, email) VALUES (?, ?, ?, ?, ?)");
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getTelefone());
            stmt.setString(3, f.getEndereco());
            stmt.setString(4, f.getCep());
            stmt.setString(5, f.getEmail());
            
            stmt.executeUpdate();
                    
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!!!");
            
                    } catch (SQLException ex) {
                        
            JOptionPane.showMessageDialog(null, "Erro ao salvar " +ex);            
            
            
        }finally{
            conexaodb.closeConnection(con, stmt);
        }
    }
    
}

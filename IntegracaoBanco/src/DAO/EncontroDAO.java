package DAO;

import java.sql.*;

import DTO.EncontroDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;//preparando a conexao
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EncontroDAO {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
        
    public void cadastrarSolicitacao(EncontroDTO e){
        String sql = "insert into encontro (contato, item, unidade) values (?,?,?) ";
        
        con = new ConexaoDAO().conectaBD();

        try {

            pst = con.prepareStatement(sql);
            pst.setString(1, e.getContato());
            pst.setString(2, e.getItem());
            pst.setString(3, e.getUnidade());
            
            System.out.println("SQL: " + pst.toString());

            pst.execute();
            pst.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "EncontroDAO cadastrar" + erro);

        }
        
    }
   
}

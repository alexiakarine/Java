package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {
   
    
     public Connection conectaBD (){   
      Connection con = null;
      
         try {
             String url = "jdbc:mysql://localhost:3306/reservas?user=root&password=rick@morty" ;
             con = DriverManager.getConnection(url);
             
         } catch (SQLException erro) {
             JOptionPane.showMessageDialog(null, "Falha na conexao" + erro.getMessage());
         }
        return con;
     }
 
 
    
}
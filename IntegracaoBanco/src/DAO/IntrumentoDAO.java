
package DAO;

import DTO.EncontroDTO;
import DTO.IntrumentoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;//preparando a conexao
import javax.swing.JOptionPane;

public class IntrumentoDAO {
     Connection con;
    PreparedStatement pst;
    public void cadastrarSolicitacao(IntrumentoDTO I){
        String sql = "insert into encontro (instrumento) values (?) ";
        
        con = new ConexaoDAO().conectaBD();

        try {

            pst = con.prepareStatement(sql);
            pst.setString(3, I.getInstrumento());
            
            pst.execute();
            pst.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "EncontroDAO cadastrar" + erro);

        }
        
    }
}


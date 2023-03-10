package DAO;

import DTO.EncontroDTO;
import DTO.IntrumentoDTO;
import DTO.MusicaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;//preparando a conexao
import javax.swing.JOptionPane;
public class MusicaDAO {
    
    public class IntrumentoDAO {
     Connection con;
    PreparedStatement pst;
    public void cadastrarSolicitacao(MusicaDTO c){
        String sql = "insert into encontro (cancao) values (?) ";
        
        con = new ConexaoDAO().conectaBD();

        try {

            pst = con.prepareStatement(sql);
            pst.setString(1, c.getCancao());
            
            pst.execute();
            pst.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "EncontroDAO cadastrar" + erro);

        }
    
}
}
}

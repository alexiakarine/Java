/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author Home-Alexia
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Mostrar_mensagem//JOptionPane.showMessageDialog(null,"Olá mundo","Boas Vindas",JOptionPane.INFORMATION_MESSAGE);
        int n, s = 0;   
        do{
             n = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um número"));
             s += n; 
        }while(n!=0);
        JOptionPane.showMessageDialog(null,"Resultado final " + "Somatória vale: " + s);
    }
        
    
}

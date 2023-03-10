/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author Home-Alexia
 */
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Seu modelo é " + this.modelo);
        System.out.println("Com a ponta " + this.ponta);
        System.out.println("Ela está com " + this.carga + " da carga total! ");
        
    }
    public void rabiscar(){
       if(this.tampada == true)
       {
           System.out.println("Pode rabiscar!");
           
       }
       else
       {
           System.out.println("Não pode rabiscar ");
       }
        
    }
    public void tampar(){
        this.tampada = true;
        
    }
 
    public void destampar(){
        this.tampada = false;
   
        
    }
     public boolean get_tampada(){
         return tampada;
     }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg11.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Metodos {
    
    private String correcto, respuesta;
    private boolean resultado;
    private long time, timeS, timeE;
    
    public Metodos(){
        
    }
    
    public Metodos(String correcto, String respuesta, boolean resultado, long time, long timeS, long timeE){
        this.correcto=correcto;
        this.respuesta=respuesta;
        this.resultado=resultado;
        this.time=time;
    }
    
    private void introducirFrase(){
        timeS = System.currentTimeMillis();
        respuesta = JOptionPane.showInputDialog("ESCRIBE TAL CUAL A SEGUINTE FRASE :\nA documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática");
        correcto = "A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática";
        
        if(respuesta.equals(correcto)){
            resultado = true;
            timeE = System.currentTimeMillis();
            correcto();
        }
        
        else{
            resultado = false;
        }
        
        while(resultado==false)
            fallo();
        
        
    }
    
    private void fallo(){
        JOptionPane.showMessageDialog(null, "Has cometido algún erro.\n" + respuesta + "\nPREME ENTER PARA REINTENTAR ");
        respuesta = JOptionPane.showInputDialog("ESCRIBE TAL CUAL A SEGUINTE FRASE :\nA documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática");
       
        if(respuesta.equals(correcto)){
            resultado = true;
            timeE = System.currentTimeMillis();
            correcto();
        }
        
        else
            resultado = false;
    }
    
    public void calcularTiempo(){
        introducirFrase();
        time = (timeE-timeS)/1000;
        JOptionPane.showMessageDialog(null, "Has tardado " + time + " segundos en escribir la frase correctamente.");
    }
    
    private void correcto(){
        JOptionPane.showMessageDialog(null, respuesta + "\nPREME ENTER PARA REMATAR ");
    }

}

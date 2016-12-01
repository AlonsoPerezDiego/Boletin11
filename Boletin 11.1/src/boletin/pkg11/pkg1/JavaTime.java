/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg11.pkg1;

import java.time.Duration;
import java.time.Instant;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class JavaTime {
    
    private String respuesta, correcto;
    private boolean resultado;
    
    public JavaTime(){
    }
    
    public void tiempo(){
        
        Instant inicio = Instant.now();
        respuesta = JOptionPane.showInputDialog("ESCRIBE TAL CUAL A SEGUINTE FRASE :\nA documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática");
        correcto = "A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática";
        aciertoOError();
        Instant fin = Instant.now();
        correcto();
        JOptionPane.showMessageDialog(null, Duration.between(inicio, fin).getSeconds() + " para escribir la frase.");
    }
    
    private void aciertoOError(){
        if(respuesta.equals(correcto))
            resultado = true;

        else
            resultado = false;
        
        while(resultado==false)
            fallo();
    }
    
    private void fallo(){
        JOptionPane.showMessageDialog(null, "Has cometido algún erro.\n" + respuesta + "\nPREME ENTER PARA REINTENTAR ");
        respuesta = JOptionPane.showInputDialog("ESCRIBE TAL CUAL A SEGUINTE FRASE :\nA documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática");
       
        if(respuesta.equals(correcto))
            resultado = true;

        else
            resultado = false;
    }
    
    private void correcto(){
        JOptionPane.showMessageDialog(null, respuesta + "\nPREME ENTER PARA REMATAR ");
    }
    
}

package boletin.pkg11.pkg1;
// @author Diego

import javax.swing.JOptionPane;

public class Boletin111 {

    public static void main(String[] args) {
        
        Metodos obj = new Metodos();
        JavaTime objeto = new JavaTime();
        
        byte selector;
        selector = Byte.parseByte(JOptionPane.showInputDialog("Pulsa 1 para utilizar curretTimeMillis.\nPulsa 2 para ultilizar Instant y Duration."));
        
        switch(selector){
            
            case 1: objeto.tiempo();
                    break;
            
            case 2: obj.calcularTiempo();
                    break;
                    
            default: JOptionPane.showMessageDialog(null, "Adios.");
                    
        }
            
        
            
        
        
        
    }
    
}

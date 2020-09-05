/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorySample;

import javax.swing.JOptionPane;

/**
 *
 * @author paulocesarmelo
 */
public class Program {
    
    public static void main(String[] args) {
        
        //Fabrica genérica
        GUIFactory factory = null;
    
        String so = JOptionPane.showInputDialog("Informe seu SO: ");
        
        //criando a fabrica concreta...
        if(so.equals("Windows")){
            factory = GUIFactory.getInstance(OS.Windows);
        }else if(so.equals("MacOS")){
            factory = GUIFactory.getInstance(OS.MacOS);
        }
        
        //A fábrica criando os objetos...
        Button bt = factory.createButton();
        TextField tf = factory.createTextField();
        
        
        //Manipulando os objetos
        bt.resizeButton();
        bt.shadowButton();
        tf.resizeTF();
        tf.shadowTF();
        
    }
    
}

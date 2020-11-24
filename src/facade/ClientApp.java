/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import javax.swing.JOptionPane;

/**
 *
 * @author paulocesarmelo
 */
public class ClientApp {
    
    public static void main(String[] args){
     
        File filePP = new File();
        ConvertFacade facade = new ConvertFacade();
        
        filePP.setName("test");
        filePP.setExt(".pp");
        
        System.out.println("Arquivo original: "+filePP.getName()+filePP.getExt());
        
        String tipo = JOptionPane.showInputDialog("Qual tipo deseja converter: ");
        
        File file = facade.convertFile(filePP, tipo);
        
        System.out.println("Arquivo convertido: "+file.getName()+file.getExt());
        
        
    }   
    
}

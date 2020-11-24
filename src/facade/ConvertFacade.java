/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author paulocesarmelo
 */
public class ConvertFacade {
    
    public File convertFile(File file, String tipo){
        File newFile = new File();
        
        if(tipo.equals("xyz")){
            ConversorX convX = new ConversorX();
            ConversorXY convXY = new ConversorXY();
            ConversorXYZ convXYZ = new ConversorXYZ();
            
            newFile = convX.convertPPtoX(file);
            newFile = convXY.convertXtoXY(newFile);
            newFile = convXYZ.convertXYtoXYZ(newFile);
            
        }else if(tipo.equals("xy")){
            
           ConversorX convX = new ConversorX();
           ConversorXY convXY = new ConversorXY(); 
           
           newFile = convX.convertPPtoX(file);
           newFile = convXY.convertXtoXY(newFile);
           
        }else if(tipo.equals("x")){
            
            ConversorX convX = new ConversorX();
            newFile = convX.convertPPtoX(file);
            
        }
        
        return newFile;
    }
    
}

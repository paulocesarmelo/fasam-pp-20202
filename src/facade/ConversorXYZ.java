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
public class ConversorXYZ {
    
    public File convertXYtoXYZ(File file){
        
        File newFile = new File();
        newFile.setName(file.getName());
        newFile.setExt(".xzy");
        
        return newFile;
        
    }
    
    
}

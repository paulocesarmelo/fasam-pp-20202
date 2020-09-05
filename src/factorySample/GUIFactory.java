/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorySample;

/**
 *
 * @author paulocesarmelo
 */
public abstract class GUIFactory {
    
    public static GUIFactory getInstance(OS os){
        switch(os){
            
            case MacOS:
                return new MacOSFactory();
            
            case Windows:
                return new WindowsFactory();
            
            default:
                return null;
        }
    }
    
    abstract Button createButton();
    abstract TextField createTextField();
    
}

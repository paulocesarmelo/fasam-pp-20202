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
public class MacOSTextField extends TextField{

    @Override
    void resizeTF() {
        System.out.println("Resizing MacOS textField...");
    }

    @Override
    void shadowTF() {
        System.out.println("Applying shadow in MacOS textField...");
    }
    
}

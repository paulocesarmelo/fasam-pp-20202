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
public class WindowsButton extends Button{

    @Override
    void resizeButton() {
        System.out.println("Resizing Windows button...");
    }

    @Override
    void shadowButton() {
        System.out.println("Applying shadow in Windows button...");
    }
    
}

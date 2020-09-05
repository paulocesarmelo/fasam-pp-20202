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
public class WindowsFactory extends GUIFactory{

    @Override
    Button createButton() {
        return new WindowsButton();
    }

    @Override
    TextField createTextField() {
        return new WindowsTextField();
    }
    
}

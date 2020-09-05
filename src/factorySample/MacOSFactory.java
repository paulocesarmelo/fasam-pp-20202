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
public class MacOSFactory extends GUIFactory{

    @Override
    Button createButton() {
        return new MacOSButton();
    }

    @Override
    TextField createTextField() {
        return new MacOSTextField();
    }
    
}

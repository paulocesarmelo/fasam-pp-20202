/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import project.MenuInterface;
import project.MenuUser;

/**
 *
 * @author paulocesarmelo
 */
public class UserFactory implements SPPFactory{

    @Override
    public MenuInterface createMenu() {
        return new MenuUser();
    }
    
    
    
}

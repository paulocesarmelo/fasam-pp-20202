/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator_notifier;

import javax.swing.JOptionPane;

/**
 *
 * @author paulocesarmelo
 */
public class Application {
    
    Notifier notifier;
    
    public void setNotifier(Notifier notifier){
        this.notifier = notifier;
    }
    
    public void doSomething(){
        String message = JOptionPane.showInputDialog("Digite a mensagem: ");
        notifier.send(message);
    }
    
}

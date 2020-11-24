/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator_notifier;

/**
 *
 * @author paulocesarmelo
 */
public class BaseDecorator extends Notifier{
    
    private Notifier wrappee;
    
    public BaseDecorator(Notifier notifier){
        wrappee = notifier;
    }
    
    @Override
    public void send(String message){
        wrappee.send(message);
    }
    
    
}

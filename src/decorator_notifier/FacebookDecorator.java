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
public class FacebookDecorator extends BaseDecorator{
    
    public FacebookDecorator(Notifier notifier) {
        super(notifier);
    }
    
    @Override
    public void send(String message){
        super.send(message);
        this.sendFacebookNotify(message);
    }
    
    public void sendFacebookNotify(String message){
        System.out.println("Enviando notificação para o facebook: "+message);
    }
    
}

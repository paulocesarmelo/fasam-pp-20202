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
public class SMSDecorator extends BaseDecorator{
    
    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }
    
    public void send(String message){
        super.send(message);
        this.sendSMS(message);
    }
    
    public void sendSMS(String message){
        System.out.println("Enviando sms: "+message);
    }
    
}

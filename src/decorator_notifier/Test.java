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
public class Test {
    
    public static void main(String[] args) {
        
        Application app = new Application();
        
        boolean facebookEnabled = false;
        boolean smsEnabled = false;
        
        Notifier stackNotifier = new Notifier(); //crio um notificador via E-MAIL
        
        if(facebookEnabled){
            stackNotifier = new FacebookDecorator(stackNotifier); // envolvo o objeto concreto (notifier) no wrapper
        }
        
        if(smsEnabled){
            stackNotifier = new SMSDecorator(stackNotifier);
        }
        
        app.setNotifier(stackNotifier);
        
        app.doSomething();
        
        
    }
    
}

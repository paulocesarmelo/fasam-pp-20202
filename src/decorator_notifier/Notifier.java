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
public class Notifier {
    
    public void send(String message){
        System.out.println("Enviando mensagem por e-mail: "+message);
    }
    
}

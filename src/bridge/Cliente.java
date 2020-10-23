/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author paulocesarmelo
 */
public class Cliente {
    
    public static void main(String[] args) {
        
        Forma f1 = new Quadrado();
        Forma f2 = new Circulo();
        
        System.out.println("Quadrado: ");
        f1.defineCor("vermelho");
        f1.imprimirCodigoCor();
     
        
        System.out.println("Circulo: ");
        f2.defineCor("azul");
        f2.imprimirCodigoCor();
        
    }
    
}

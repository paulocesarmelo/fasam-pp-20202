/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype_demo;

/**
 *
 * @author paulocesarmelo
 */
public class Teste2 {
    
    public static void main(String[] args){
        Teste1 obj1 = new Teste1();
        Teste1 obj2 = new Teste1();
        
        obj1.setAttr1("Attr 1");
        
        obj2 = obj1;
        
        System.out.println(obj2.getAttr1());
        
        obj2.setAttr1("new attr 1");
        
        System.out.println(obj1.getAttr1());
        
    }
    
}

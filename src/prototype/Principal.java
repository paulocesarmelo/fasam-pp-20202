/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author paulocesarmelo
 */
public class Principal {
    
    public static void main(String[] args) {
        
        ClasseX obj1 = new ClasseX();
        
        obj1.setNome("objeto");
        
        ClasseX obj2 = obj1; //passando a ref. do obj1 para o obj2
               
        System.out.println(obj2.getNome());
        
        obj2.setNome("novo objeto");
        
        System.out.println(obj1.getNome());
        
        if(obj1 == obj2){
            System.out.println("são iguais");
        }
        
        if(obj1.equals(obj2))
                System.out.println("são iguais (equals)");
        
        ClasseX obj3 = new ClasseX();
        
        obj3.setNome(obj1.getNome());
        
        if(obj3.equals(obj1))
            System.out.println("obj3 é igual ao obj1");
        
    }
    
}
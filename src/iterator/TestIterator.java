/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;


import adapter.ProdutoPP;
import java.util.LinkedList;
import java.util.Iterator;

/**
 *
 * @author paulocesarmelo
 */
public class TestIterator {

    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<String>();
        
        list.add("Fulano");
        list.add("Beltrano");
        list.add("Ciclano");
              
        //custo de ordenação
        
        Iterator<String> it = list.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        
        
        
    }
    
}

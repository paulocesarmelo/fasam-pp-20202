/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author paulocesarmelo
 */
public class Cliente {
    
    public static void main(String[] args) {
        
       Cesta cesta = new Cesta();
        
       cesta.addProduto(new Trufa());
       cesta.addProduto(new Barra());
       
       Produto[] produtos = new Produto[5];
       
       produtos[0] = cesta;
       produtos[1] = new Trufa();
       produtos[2] = new Barra();
       
        
    }
    
}

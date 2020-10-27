/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.LinkedList;

/**
 *
 * @author paulocesarmelo
 */
public class Cesta extends Produto{

    private LinkedList<Produto> listaProd = new LinkedList<Produto>();
    
    
    public void addProduto(Produto p){
        listaProd.add(p);
    }
    
    @Override
    public void calcularPreco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import java.util.LinkedList;

/**
 *
 * @author paulocesarmelo
 */
public class Cliente {
    
    public static void main(String[] args){
        
        LinkedList<ProdutoPP> produtosPP = new LinkedList<ProdutoPP>();
        
        ProdutoXPTO prod = new ProdutoXPTO();
        ProdutoXYZ prod2 = new ProdutoXYZ();
        
        
        prod.setCodigo("123456789");
        prod2.setCodigo("XYZ-9999");
        
        AdaptadorProdutoXPTO adaptador = new AdaptadorProdutoXPTO(prod);
        AdaptadorProdutoXYZ adaptadorXYZ = new AdaptadorProdutoXYZ(prod2);
        
        ProdutoPP prodPP = new ProdutoPP();
        
        prodPP.setCodigo(adaptador.getCodigo());
        
        produtosPP.add(prodPP);
        
        ProdutoPP prodPP2 = new ProdutoPP();
        prodPP2.setCodigo(adaptadorXYZ.getCodigo());
        
        
        System.out.println("Codigo XPTO: "+prod.getCodigo());
        System.out.println("Codigo convertido: "+adaptador.getCodigo());
        
        
        System.out.println("Codigo XYZ: "+prod2.getCodigo());
        System.out.println("Codigo convertido: "+adaptadorXYZ.getCodigo());
        
        
        
    }
    
}

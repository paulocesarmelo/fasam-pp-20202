/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author paulocesarmelo
 */
public class AdaptadorProdutoXPTO extends ProdutoPP{
    
    private ProdutoXPTO produto;
    
    public AdaptadorProdutoXPTO(ProdutoXPTO produto){
        this.produto = produto;
    }
    
    //método responsável pela adaptação
    public String getCodigo(){
        
        String codPP = super.construirCodigo(produto.getCodigo());
        
        super.setCodigo(codPP);
        
        return codPP;
    }
    
}

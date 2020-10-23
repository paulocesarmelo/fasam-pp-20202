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
public class AdaptadorProdutoXYZ extends ProdutoPP{
    
    private ProdutoXYZ produto;
    
    public AdaptadorProdutoXYZ(ProdutoXYZ produto){
        this.produto = produto;
    }
    
    //método responsável pela adaptação
    public String getCodigo(){
        
        String[] texto = produto.getCodigo().split("-");
        
        String codPP = super.construirCodigo(texto[1]);
        
        super.setCodigo(codPP);
        
        return codPP;
    }
    
}

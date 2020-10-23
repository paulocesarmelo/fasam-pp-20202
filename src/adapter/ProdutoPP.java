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
public class ProdutoPP {

    private String codPP;
    
    public void setCodigo(String codigo){
        this.codPP = codigo;
    }
    
    public String construirCodigo(String codNumerico){
        return "PP"+codNumerico;
    }
    
    public String getCodigo(){
        return this.codPP;
    }
    
}

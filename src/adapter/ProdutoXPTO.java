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
public class ProdutoXPTO {
    
    private String codXPTO; //12314141
    
    public void setCodigo(String codigo){
        this.codXPTO = codigo;
    }
    
    public String getCodigo(){
        return this.codXPTO;
    }
    
}

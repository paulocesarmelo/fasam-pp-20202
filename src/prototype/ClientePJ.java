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
public class ClientePJ extends Cliente{
    
    private String cnpj;
    
    public ClientePJ(){}
    
    public ClientePJ(ClientePJ objMatriz){
        super(objMatriz);
        
        if(objMatriz != null){
            this.cnpj = objMatriz.getCnpj();
        }
    }
    
    @Override
    public Cliente clonar() {
        return new ClientePJ(this);
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public boolean equals(ClientePJ cliente){
        if ( super.equals(cliente) && this.cnpj.equals(cliente.getCnpj())){
            return true;
        }else{
            return false;
        }
            
    }
    
}

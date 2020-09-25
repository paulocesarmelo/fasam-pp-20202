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
public class ClientePF extends Cliente{

    private String cpf;
    
    public ClientePF(){}
    
    public ClientePF(ClientePF objMatriz){
        super(objMatriz);
        
        if(objMatriz != null){
            this.cpf = objMatriz.getCpf();
        }
    }
    
    @Override
    public Cliente clonar() {
        return new ClientePF(this);
    }
    
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public boolean equals(ClientePF cliente){
        if ( super.equals(cliente) && this.cpf.equals(cliente.getCpf())){
            return true;
        }else{
            return false;
        }
            
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author paulocesarmelo
 */
public class Basic extends Categoria{

    public Basic(){
        super();
        super.addBeneficio("Cafezinho");            
    }
    
    @Override
    public void acionarBeneficio(int idBeneficio) {
   
        System.out.println("Beneficio: "+ super.getBeneficios().get(idBeneficio));
        
        if(idBeneficio == 0){
            System.out.println("Gerando o cafezinho...");
        } 
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

import java.util.LinkedList;

/**
 *
 * @author paulocesarmelo
 */
public class Gold extends Categoria{

    
    public Gold(){
        super();
        super.addBeneficio("Cafezinho");
        super.addBeneficio("Desconto 5% na recompra");
            
    }
    
    @Override
    public void acionarBeneficio(int idBeneficio) {
        
        System.out.println("Beneficio: "+ super.getBeneficios().get(idBeneficio));
        
        if(idBeneficio == 0){
            System.out.println("Gerando o cafezinho...");
        }else if(idBeneficio == 1){
            
            System.out.println("Calculando os 5% de desconto...");
        }
        
    }
    
}

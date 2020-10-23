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
public class Platinum extends Categoria{
    
    public Platinum(){
        super();
        super.addBeneficio("Cafezinho");
        super.addBeneficio("Desconto 10% na recompra");
        super.addBeneficio("Viagem para Caldas Novas");
            
    }

    @Override
    public void acionarBeneficio(int idBeneficio) {
        
        System.out.println("Beneficio: "+ super.getBeneficios().get(idBeneficio));
        
        if(idBeneficio == 0){
            System.out.println("Gerando o cafezinho...");
        }else if(idBeneficio == 1){
            System.out.println("Calculando os 10% de desconto...");
        }else if(idBeneficio == 2){
            System.out.println("Viagem emitida para Caldas Novas!");
        }
        
    }
    
    
    
}

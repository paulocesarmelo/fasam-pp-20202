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
public class Diamond extends Categoria{
    
    public Diamond(){
        super();
        super.addBeneficio("Cafezinho");
        super.addBeneficio("Desconto 15% na recompra");
        super.addBeneficio("Viagem para Caldas Novas");
        super.addBeneficio("Viagem para Cancum");
            
    }

    @Override
    public void acionarBeneficio(int idBeneficio) {
        
        System.out.println("Beneficio: "+ super.getBeneficios().get(idBeneficio));
        
        if(idBeneficio == 0){
            System.out.println("Gerando o cafezinho...");
        }else if(idBeneficio == 1){
            System.out.println("Calculando os 15% de desconto...");
        }else if(idBeneficio == 2){
            System.out.println("Viagem emitida para Caldas Novas!");
        }else if(idBeneficio == 3){
            System.out.println("Viagem para Cancum emitida!");
        }
        
    }
    
}

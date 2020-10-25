/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

import prototype.*;

/**
 *
 * @author paulocesarmelo
 */
public class PrincipalBridge {
    
    public static void main(String[] args) {
        //cadastro
        ClientePF c1 = new ClientePF();
        ClientePF c2 = new ClientePF();
        ClientePF c3 = new ClientePF();
        
        //venda....
        c1.setNome("Fulano");
        c2.setNome("Beltrano");
        c3.setNome("Cicrano");
        
        //pós-venda
        c1.addCategoria(1);
        c2.addCategoria(2);
        c3.addCategoria(4);
        
        
        System.out.println("\nBeneficios para o "+c1.getNome());
        c1.acionarBeneficio(0);
        c1.acionarBeneficio(1);
        
        System.out.println("\nBeneficios para o "+c2.getNome());
        c2.acionarBeneficio(0);
        c2.acionarBeneficio(1);
        c2.acionarBeneficio(2);
        
        System.out.println("\nBeneficios para o "+c3.getNome());
        c3.acionarBeneficio(0);
        
    }
    
}

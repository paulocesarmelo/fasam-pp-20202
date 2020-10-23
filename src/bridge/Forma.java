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
public class Forma {
    
    private Cor cor;
    
    public void defineCor(String nome){
        if(nome.equals("vermelho")){
            cor = new Vermelho();
        }else{
            cor = new Azul();
        }
    }
    
    public void imprimirCodigoCor(){
        this.cor.imprimirCodigoCor();
    }
    
}

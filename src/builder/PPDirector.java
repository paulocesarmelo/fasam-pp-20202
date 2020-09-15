/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author paulocesarmelo
 */
public class PPDirector {
    
    protected CarroBuilder builder;
    
    public PPDirector(CarroBuilder builder){
        this.builder = builder;
    }
    
    public void builderCarro(){
        builder.buildPreco();
        builder.buildModelo();
        builder.buildMontadora();
        builder.buildAnoDeFabricacao();
        builder.buildMotor();
    }
    
    public CarroProduct getCarro(){
        return builder.getProduct();
    }
    
}

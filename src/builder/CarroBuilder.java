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
public abstract class CarroBuilder {
    
    protected CarroProduct carro;
    
    public CarroBuilder(){
        carro = new CarroProduct();
    }
    
    public abstract void buildPreco();
    public abstract void buildMotor();
    public abstract void buildModelo();
    public abstract void buildMontadora();
    public abstract void buildAnoDeFabricacao();
 
    public abstract CarroProduct getProduct();
    
}

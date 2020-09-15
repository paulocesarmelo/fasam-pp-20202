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
public class BMWBuilder extends CarroBuilder{

    @Override
    public void buildPreco() {
        carro.preco = 170000;
    }

    @Override
    public void buildMotor() {
        carro.motor = "2.0";
    }

    @Override
    public void buildModelo() {
        carro.modelo = "320i";
    }

    @Override
    public void buildMontadora() {
        carro.montadora = "BMW";
    }

    @Override
    public void buildAnoDeFabricacao() {
        carro.anoFabricaca = 2020;
    }

    @Override
    public CarroProduct getProduct() {
        return carro;
    }
    
}

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
public class MercedesBuilder extends CarroBuilder{

    @Override
    public void buildPreco() {
        carro.preco = 230000.0;
    }

    @Override
    public void buildMotor() {
        carro.motor = "turbo";
    }

    @Override
    public void buildModelo() {
        carro.modelo = "C180";
    }

    @Override
    public void buildMontadora() {
        carro.montadora = "Mecedes Benz";
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

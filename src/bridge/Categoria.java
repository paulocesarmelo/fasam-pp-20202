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
public abstract class Categoria {
    
    private int id;
    private String descricao;
    private float taxaDesconto;
    private LinkedList<String> beneficios;

    public Categoria(){
        beneficios = new LinkedList<String>();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getTaxaDesconto() {
        return taxaDesconto;
    }

    public void setTaxaDesconto(float taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
    }

    public LinkedList<String> getBeneficios() {
        return beneficios;
    }

    public void setBeneficio(LinkedList<String> beneficios) {
        this.beneficios = beneficios;
    }
    
    public void addBeneficio(String beneficio){
        this.beneficios.add(beneficio); 
    }

    public abstract void acionarBeneficio(int idBeneficio);
    
    @Override
    public String toString() {
        return "Categoria{" + "id=" + id + ", descricao=" + descricao + ", taxaDesconto=" + taxaDesconto + ", "+beneficios.toString()+ " }";
    }
    
    
    
}

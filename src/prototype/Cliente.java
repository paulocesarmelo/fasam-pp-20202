/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author paulocesarmelo
 */
public abstract class Cliente {
    
    private String nome;
    private int cod;
    
    public Cliente(){}
    
    public Cliente(Cliente clienteMatriz){
        if(clienteMatriz != null){
            this.nome = clienteMatriz.getNome();
            this.cod = clienteMatriz.getCod();
        }
    }
    
    public abstract Cliente clonar();
    
    public boolean equals(Cliente cliente){
        if(this.nome.equals(cliente.getNome()) && this.cod == cliente.getCod()){
            return true;
        }else{
            return false;
        }
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    
    
    
}

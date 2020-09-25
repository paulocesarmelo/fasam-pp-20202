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
public class ClasseX {
    
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public boolean equals(ClasseX obj){
       
        if(obj.getNome().equals(this.nome)){
            return true;
        }
        return false;
        
    }
    
    
}

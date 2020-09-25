/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.LinkedList;

/**
 *
 * @author paulocesarmelo
 */
public class TesteCliente {
    
    
    static LinkedList<Cliente> clientes = new LinkedList<Cliente>();
    static LinkedList<Cliente> clientesCopias = new LinkedList<Cliente>();
   
    
    public static void main(String[] args) {
        
        ClientePF cli1 = new ClientePF();
        cli1.setCod(1);
        cli1.setNome("Fulano");
        cli1.setCpf("123.123.123-12");
        
        clientes.add(cli1);
        
        ClientePF novoCli = (ClientePF) cli1.clonar();
        //clientes.add(novoCli);
        
        if(cli1.equals(novoCli)){
            System.out.println("Cli1 é igual ao novoCli");
        }else{
            System.out.println("Cli1 é diferente ao novoCli");
        }
        
        ClientePJ cli2 = new ClientePJ();
        cli2.setCod(2);
        cli2.setNome("Beltrano");
        cli2.setCnpj("333.33333333");
        
        clientes.add(cli2);
        
        ClientePF cli3 = new ClientePF();
        cli3.setCod(1);
        cli3.setNome("João");
        cli3.setCpf("123.123.123-12");
        
        clientes.add(cli3);
        
        criarClones();
        
        System.out.println("Tamanho da lista de clones: "+clientesCopias.size());
        
        testarNovaFuncionalidade();
    }
    
    public static void criarClones(){
        
        ClientePF novoCliPF;
        ClientePJ novoCliPJ;
        
        for(int i=0; i<clientes.size(); i++){
            
            if(clientes.get(i) instanceof ClientePF){
               novoCliPF = (ClientePF) clientes.get(i).clonar(); 
               clientesCopias.add(novoCliPF);
            }else{
               novoCliPJ = (ClientePJ) clientes.get(i).clonar(); 
               clientesCopias.add(novoCliPJ);
            }
        }
        
    }
    
    public static void testarNovaFuncionalidade(){
        
        //novo validador de cpf
        //String[] partes = new String[3];
        //String[] subpart = new String[2];
        ClientePF novoCliPF;
        //String novoCPF;
        
        for(int i=0; i<clientesCopias.size(); i++){
            if(clientesCopias.get(i) instanceof ClientePF){
                novoCliPF = (ClientePF) clientesCopias.get(i);
                System.out.println("Nome antigo: "+novoCliPF.getNome());
                
                novoCliPF.setNome(novoCliPF.getNome().toUpperCase());
               /* String[] partes = novoCliPF.getCpf().split(".");
                System.out.println(partes.length);
                //subpart = partes[].split("-");
                
                //novoCPF = partes[0] + partes[1] + subpart[0] + subpart[1];
                
                System.out.println("Novo cpf: "+novoCPF);
                */
               System.out.println("Novo nome: "+novoCliPF.getNome());
                        
            }
            
           
            
        }
        
    }
    
}

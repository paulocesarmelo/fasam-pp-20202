package project;

import java.util.LinkedList;

//Singleton class
public class DataManager{
	
	private static DataManager instance;
	private LinkedList<Product> produtos;
	
	private DataManager() {
		produtos = new LinkedList<Product>();
	}
	
	public static DataManager getInstance() {

                if(instance == null) {
                    instance = new DataManager();
		}
		
		return instance;
		
	}
	
	public void addProduto(Product produto) {
		produtos.add(produto);
	}
	
	public LinkedList<Product> getProdutos(){
		return produtos;
	}
	

}

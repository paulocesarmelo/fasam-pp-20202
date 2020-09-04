package project;

public class Teste1 {

	public static void main(String[] args) {
		
		DataManager dm = DataManager.getInstance();
		
		Product p = new Product();
		
		p.setName("Bolacha");
		
		dm.addProduto(p);
		
		Teste2.usandoDataManager();
                
	}
	
}

package project;

public class Teste2 {

	public static void usandoDataManager() {
		
		DataManager dm = DataManager.getInstance();
		
		System.out.println(dm.getProdutos().get(0).getName());
		
	}
	
}

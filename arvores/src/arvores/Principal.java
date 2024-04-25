package arvores;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		Arvore arvore = new Arvore();
		
		    arvore.adicionar(5);
		    arvore.adicionar(1);
	        arvore.adicionar(3);
	        arvore.adicionar(7);
	        arvore.adicionar(2);
	        arvore.adicionar(4);
	        arvore.adicionar(6);
	        arvore.adicionar(8);
	        arvore.adicionar(9);
	        
	        arvore.posOrdem();
	        System.out.println(" Pós ordem \n");
	        arvore.preOrdem();
	        System.out.println(" Pre-ordem \n");
	        arvore.emOrdem();
	        System.out.println(" Em-ordem ");
	        
	}

}

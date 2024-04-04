package aula10;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		ListaDuplamenteEncadeada l = new ListaDuplamenteEncadeada();
	    
		
		l.adicionar(3);
		l.adicionar(1);
		l.adicionar(11);
		l.adicionar(9);	
		l.adicionar(0);
		
		
		l.imprimirLista();
		
		l.remover(3);
		l.remover(11);
		
		l.imprimirLista();
	}

}

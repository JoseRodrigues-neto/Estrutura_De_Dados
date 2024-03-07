package Aula05;

public class Principal {

	public static void main(String[] args) {
		PilhaDinamica<String> pilha = new PilhaDinamica<>();

		System.out.println("///////PILHA///////////");
		pilha.push("Java");
		pilha.push("Delfin");
		pilha.push("Rust");

		System.out.println("pilha está fazia?:" + pilha.pilhaVazia());
		System.out.println("Tamanho da pilha:" + pilha.tamanhoPilha());

		pilha.imprimir();

		System.out.println("----------");
		pilha.pop();

		pilha.imprimir();

		System.out.println("///////FILA///////////");
		FilaDinamica<Integer> fila = new FilaDinamica<>();

		fila.inserir(1);
		fila.inserir(2);
		fila.inserir(3);
		fila.inserir(4);	

		System.out.println("Fila está fazia?:" + fila.FilaVazia());
		System.out.println("Tamanho da fila:" + fila.FilaTamanho());
		
		fila.imprimir();
		
		fila.remover();
		fila.remover();
		fila.remover();
		
		System.out.println("----------");
		fila.imprimir();
	}

}

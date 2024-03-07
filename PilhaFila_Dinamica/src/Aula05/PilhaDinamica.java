package Aula05;

public class PilhaDinamica<T> {

	private No<T> topo;
	private int tamanho;

	public PilhaDinamica() {
		this.topo = null;
		this.tamanho = 0;
	}

	public void push(T dado) {
		No<T> axil = new No<>(dado);
		axil.proximo = topo;
		topo = axil;
		tamanho++;
	}

	public T pop() {
		if (topo == null) {
			System.out.println("invalido");
		}
		T dadoRemovido = topo.dado;
		topo = topo.proximo;
		tamanho--;
		return dadoRemovido;
	}

	public int tamanhoPilha() {
		return tamanho;
	}

	public boolean pilhaVazia() {
		return tamanho == 0;
	}

	public void imprimir() {
		No<T> axil = topo;
		while (axil != null) {
			System.out.print(axil.dado + " \n");
			axil = axil.proximo;
		}

	}

}

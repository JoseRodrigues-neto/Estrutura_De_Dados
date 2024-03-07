package Aula05;

public class FilaDinamica<T> {
	private No<T> inicio;
	private No<T> fim;
	private int tamanho;

	public FilaDinamica() {
		this.inicio = null;
		this.fim = null;
		this.tamanho = 0;
	}

	public void inserir(T dado) {
		No<T> axil = new No<>(dado);
		if (FilaVazia()) {
			inicio = axil;
		} else {
			fim.proximo = axil;
		}
		fim = axil;
		tamanho++;
	}

	public T remover() {
		if (FilaVazia()) {
			System.out.println("Fila Vazia");
		}
		T dadoRemovido = inicio.dado;
		inicio = inicio.proximo;
		if (inicio == null) {
			fim = null;
		}
		tamanho--;
		return dadoRemovido;
	}

	public int FilaTamanho() {
		return tamanho;
	}

	public boolean FilaVazia() {
		return inicio == null;
	}

	public void imprimir() {
		No<T> axil = inicio;
		while (axil != null) {
			System.out.print(axil.dado + " ");
			axil = axil.proximo;
		}
		System.out.println();
	}
}

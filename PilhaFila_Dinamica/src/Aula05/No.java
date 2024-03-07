package Aula05;

class No<T> {
	T dado;
	No<T> proximo;

	No(T dado) {
		this.dado = dado;
		this.proximo = null;
	}
}

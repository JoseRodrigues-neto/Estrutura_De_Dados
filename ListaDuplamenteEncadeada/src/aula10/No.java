package aula10;

public class No {

	private int elemento;
	private No anterior;
	private No proximo;
	
	
	public No(int elemento ) {
		super();
		this.elemento = elemento;
		this.anterior = null;
		this.proximo = null;
	}


	public int getElemento() {
		return elemento;
	}


	public void setElemento(int elemento) {
		this.elemento = elemento;
	}


	public No getAnterior() {
		return anterior;
	}


	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}


	public No getProximo() {
		return proximo;
	}


	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
	
	
}

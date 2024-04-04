package aula10;

public class ListaDuplamenteEncadeada {
	
	private No inicio;
	private No fim;
	private int tamanho;
	
	public ListaDuplamenteEncadeada() {
		
		this.inicio = null;
		this.fim = null;
		this.tamanho = 0;
	}
	
	private void inserirInicio(int valor) {
		No noAux = new No(valor);
       if(listaVazia())	{
    	   this.fim = noAux;
    	   this.inicio =noAux;
       }
       
       noAux.setProximo(this.inicio);
       this.inicio.setAnterior(noAux);
       this.inicio = noAux;
       this.tamanho ++;
	}
	
	private void inserirFim(int valor) {
		No noAux = new No(valor);
		
		 if(listaVazia())	{
	    	   this.fim = noAux;
	    	   this.inicio =noAux;
	       }

        this.fim.setProximo(noAux);
        noAux.setAnterior(fim);
        
        this.fim = noAux;
        this.tamanho ++;
	}
	
    private void inserirMeio(int valor){
        No noAux = new No(valor);
        No noAtual = this.inicio;

        while (valor > noAtual.getElemento() && valor > noAtual.getProximo().getElemento()){
            noAtual = noAtual.getProximo();
        }
        noAux.setProximo(noAtual.getProximo());
        noAtual.getProximo().setAnterior(noAux);
        noAtual.setProximo(noAux);
         this.tamanho ++;
    }
	
    private void removerInicio(){
        No noAux = this.inicio;
        
        this.inicio = noAux.getProximo();
        noAux.setProximo(null);
        this.tamanho --;
    }
    
    private void removerFim(){
        No noAux = this.inicio;
        
        for(int i=1 ; i < (this.tamanho- 1) ; i++){
            noAux = noAux.getProximo();
        }
        noAux.getProximo().setAnterior(null);
        noAux.setProximo(null);
        this.fim = noAux;
        this.tamanho --;
    }
    
    private void removerMeio(int valor){
         No noAtual = this.inicio;

        while (valor != noAtual.getProximo().getElemento()){
            noAtual = noAtual.getProximo();
        }
        No noAux = noAtual.getProximo().getProximo();
        noAtual.getProximo().setProximo(null);
        noAtual.getProximo().setAnterior(null);

        noAtual.setProximo(noAux);
        noAux.setAnterior(noAtual);

        this.tamanho--;
    }
    
	private boolean listaVazia() {
		return inicio == null;
	}
	
	
	public void imprimirLista(){
        No noAtual = this.inicio;
        while (noAtual != null){
            System.out.print("[" + noAtual.getElemento()+"]");
            noAtual = noAtual.getProximo();
        }
        System.out.println();

    }
	
	public void adicionar(int valor){
        if (listaVazia() ||  valor < this.inicio.getElemento()){
            inserirInicio(valor);
        }
        else if(valor > fim.getElemento()){
            inserirFim(valor);
        }
        else{
            inserirMeio(valor);
        }
    }
	
	public void remover(int valor) {
		
		if(valor == inicio.getElemento()){
			removerInicio();
		} 
		else if(valor == fim.getElemento()){
          removerFim();        
          } 
		else {
			removerMeio(valor);
		}
	} 
	 

}

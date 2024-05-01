package arvores;

public class Arvore {

	No raiz;

	public Arvore() {
		this.raiz = null;
	}

	public void adicionar(int valor) {
		if (raiz == null) {
			raiz = new No(valor);
		} else {
			adicionar(raiz, valor);
		}
	}

	private void adicionar(No node, int valor) {
		if (node != null) {

			if (node.getElemento() > valor) {

				if (node.getEsquerdo() != null) {
					adicionar(node.getEsquerdo(), valor);
				} else {
					No aux = new No(valor);
					node.setEsquerdo(aux);
				}
			} else if (node.getElemento() < valor) {

				if (node.getDireito() != null) {
					adicionar(node.getDireito(), valor);
				} else {
					No aux = new No(valor);
					node.setDireito(aux);
				}
			}

		}
	}

	public void busca(int valorBusca) {
		No aux = raiz;
		while (aux != null && aux.getElemento() != valorBusca) {
			if (aux.getElemento() > valorBusca) {
				aux = aux.getEsquerdo();
			} else {
				aux = aux.getDireito();
			}
		}

		if (aux != null && aux.getElemento() == valorBusca) {
			System.out.println("Valor encontrado: " + aux.getElemento());
		} else {
			System.out.println("Valor não encontrado na árvore.");
		}
	}

	public void remover(int valorExcluir) {
		No paiAtual = null;
		No atual = raiz;

		while (atual != null && atual.getElemento() != valorExcluir) {
			paiAtual = atual;
			if (valorExcluir < atual.getElemento()) {
				atual = atual.getEsquerdo();
			} else {
				atual = atual.getDireito();
			}
		}

		if (atual == null) {
			System.out.println("Valor não encontrado.");
			return;
		}

		if (atual.getEsquerdo() == null || atual.getDireito() == null) {
			No filho = (atual.getEsquerdo() != null) ? atual.getEsquerdo() : atual.getDireito();

			if (paiAtual == null) {
				raiz = filho;
			} else if (paiAtual.getEsquerdo() == atual) {
				paiAtual.setEsquerdo(filho);
			} else {
				paiAtual.setDireito(filho);
			}
		} else {
			No sucessor = encontrarSucessor(atual);
			int valorSucessor = sucessor.getElemento();
			remover(valorSucessor);
			atual.setElemento(valorSucessor);
		}
	}

	private No encontrarSucessor(No node) {
		No sucessor = node.getDireito();
		while (sucessor.getEsquerdo() != null) {
			sucessor = sucessor.getEsquerdo();
		}
		return sucessor;
	}

	public void preOrdem() {
		preOrdemRecursivo(raiz);
	}

	private void preOrdemRecursivo(No node) {
		if (node != null) {
			System.out.print(node.getElemento() + " ");
			preOrdemRecursivo(node.getEsquerdo());
			preOrdemRecursivo(node.getDireito());
		}
	}

	public void emOrdem() {
		emOrdemRecursivo(raiz);
	}

	private void emOrdemRecursivo(No node) {
		if (node != null) {
			emOrdemRecursivo(node.getEsquerdo());
			System.out.print(node.getElemento() + " ");
			emOrdemRecursivo(node.getDireito());
		}
	}

	public void posOrdem() {
		posOrdemRecursivo(raiz);
	}

	private void posOrdemRecursivo(No node) {
		if (node != null) {
			posOrdemRecursivo(node.getEsquerdo());
			posOrdemRecursivo(node.getDireito());
			System.out.print(node.getElemento() + " ");
		}
	}
}

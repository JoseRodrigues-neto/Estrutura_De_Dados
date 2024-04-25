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

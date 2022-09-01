package estoque;

public class retirada {
	public String product;
	public int quantidade;
	
	public retirada(String product, int quantidade) {
		super();
		this.product = product;
		this.quantidade = quantidade;
	}
	
	public int atualizarEstoque(int estoqueAtual){
		estoqueAtual -= quantidade;
		System.out.println("\nO novo estoque é: " + estoqueAtual);
		return estoqueAtual;
	}

}

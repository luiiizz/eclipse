package estoque;

public class compras {
	public String produto;
	public float valor_total;
	public char tipo_de_pagamento;
	public int quantidade;
	
	public compras(String produto, float valor_total, char tipo_de_pagamento, int quantidade) {
		super();
		this.produto = produto;
		this.valor_total = valor_total;
		this.tipo_de_pagamento = tipo_de_pagamento;
		this.quantidade = quantidade;
	}
	
	public int atualizarEstoque(int estoqueAtual){
		estoqueAtual += quantidade;
		System.out.println("\nO novo estoque é: " + estoqueAtual);
		return estoqueAtual;
	}

	public void addProduto(String produto) {
		this.produto = produto;
	}

	public float getValor_total() {
		return valor_total;
	}

}

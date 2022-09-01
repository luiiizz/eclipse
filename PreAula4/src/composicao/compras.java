package composicao;

public class compras {
	public int Ncompra;
	public float valorCompra;
	public String tipoPagamento;
	
	public compras(int ncompra, float valorCompra, String tipoPagamento) {
		super();
		this.Ncompra = ncompra;
		this.valorCompra = valorCompra;
		this.tipoPagamento = tipoPagamento;
	}

	public void realizarCompra() {
		System.out.println("\nCompra Realizada:"
				+ "\nN: " + Ncompra + "\nValor: " + valorCompra+"\n\n");
	}
}

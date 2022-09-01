package composicao;



public class vendas {
	public int N_venda;
	public float Valor_Venda;
	public String tipoPagamento;
	
	public vendas(int n_venda, float valor_Venda, String tipoPagamento) {
		super();
		N_venda = n_venda;
		Valor_Venda = valor_Venda;
		this.tipoPagamento = tipoPagamento;
	}
	
	
	public void realizarVenda() {
		System.out.println("\nVenda Realizada:"
				+ "\nN: " + N_venda + "\nValor: " + Valor_Venda+"\n\n");
	}
}

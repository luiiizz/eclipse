package financeiro;

public class contasPagar {
	public int id_conta;
	public float valor_conta;
	
	
	
	public contasPagar(int id_conta, float valor_conta) {
		super();
		this.id_conta = id_conta;
		this.valor_conta = valor_conta;
	}

	public float atualizarCaixa(float caixa) {
		caixa -= valor_conta; 
		System.out.println("\nValor Atual do caixa: " + caixa);
		return caixa; 
	}
	
	public int getId_conta() {
		return id_conta;
	}

	public void setId_conta(int id_conta) {
		this.id_conta = id_conta;
	}

	public float getValor_conta() {
		return valor_conta;
	}

	public void setValor_conta(float valor_conta) {
		this.valor_conta = valor_conta;
	}
	

}

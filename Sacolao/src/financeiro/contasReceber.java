package financeiro;

public class contasReceber {
	public int id_conta;
	public float valor_conta;
	
	
	
	public contasReceber(int id_conta, float valor_conta) {
		super();
		this.id_conta = id_conta;
		this.valor_conta = valor_conta;
	}
	
	public float atualizarCaixa(float caixa) {
		caixa += valor_conta;
		System.out.println("\nValor Atual do caixa: " + caixa);
		return caixa;
	}
}


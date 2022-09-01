package agregacao;

public class Cliente {
	public String Nome;
	public float Valor_em_caixa;
	
	public Cliente(String Nome, float Valor_em_caixa) {
		super();
		this.Nome = Nome;
		this.Valor_em_caixa = Valor_em_caixa;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public float getValor_em_caixa() {
		return Valor_em_caixa;
	}

	public void setValor_em_caixa(float valor_em_caixa) {
		Valor_em_caixa = valor_em_caixa;
	}

	
	
}

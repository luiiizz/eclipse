package agregacao;

public class Aluguel {
	Cliente cliente;
	Carro carro;
	
	public Aluguel(Cliente cliente, Carro carro) {
		super();
		this.cliente = cliente;
		this.carro = carro;
	}
	
	public void Alugar() {
		cliente.Valor_em_caixa -= carro.Valor;
		
		System.out.println("\n\nCliente " + cliente.Nome + " alugou o carro "
				+ carro.Modelo + " por " + carro.Valor + " reais\n");
	}
	
	
}

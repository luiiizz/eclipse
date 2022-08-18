package Ex1;

import Ex1.produto;

public class pedido {
	public int num_ped;
	public produto itens;
	public int quantidade;
	public String tipo_pagamento;
	
	
	public pedido(int num_ped, produto itens, int quantidade, String tipo_pagamento) {
		super();
		this.num_ped = num_ped;
		this.itens = itens;
		this.quantidade = quantidade;
		this.tipo_pagamento = tipo_pagamento;
	}
	
	
	
}

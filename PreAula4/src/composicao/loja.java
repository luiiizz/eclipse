package composicao;

import java.util.Scanner;

public class loja {

	public int CNPJ;
	public String Razao_Social;
	compras compra;
	vendas venda;

	
	Scanner ler = new Scanner(System.in);
	
	public loja(int cNPJ, String razao_Social) {
		
		super();
		CNPJ = cNPJ;
		Razao_Social = razao_Social;

	}
	
	public void realizarCompra() {
		int num_compra;
		float valor1;
		
		System.out.println("Digite o numero da compra: ");
		num_compra = ler.nextInt();
		
		System.out.println("Digite o valor da compra: ");
		valor1 = ler.nextFloat();
	
		compras compra = new compras(num_compra, valor1, null);
		compra.realizarCompra();
	}
	
	public void realizarVenda() {
		int num_venda;
		float valor2;
		
		System.out.println("Digite o numero da venda: ");
		num_venda = ler.nextInt();
		
		System.out.println("Digite o valor da venda: ");
		valor2 = ler.nextFloat();
	
		vendas venda = new vendas(num_venda, valor2, null);
		
		venda.realizarVenda();
	
	}
}

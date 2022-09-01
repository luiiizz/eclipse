import java.util.Scanner;

import agregacao.Aluguel;
import agregacao.Carro;
import agregacao.Cliente;
import associacao.Laptop;
import associacao.Screen;
import composicao.loja;

public class principal {

	public static void main(String[] args) {
		int op;
		int  cnpj;
		String razao;
		Aluguel aluguel;
		
		do {
			System.out.println("\nDigite  o tipo de relacionamentos:"
						+ "	\n 1. Associação "
						+ "	\n 2. Agregação "
						+ "	\n 3. Composição "
						+ " \n 4. Sair");
			
			Scanner ler = new Scanner(System.in);
			
			op = ler.nextInt();
				
		
			if(op == 1) {
				
				Screen tela = new Screen(20,50);
				
				Laptop laptop1 = new Laptop("DELL", 2022, tela);
				
				laptop1.comprarlaptop();
				
				System.out.println("Atributo tela do laptop é da classe screen\n");
			}	
			
			else if(op == 2) {
				String modelo;
				float valorC;
				String nome;
				float valor;
				
				System.out.println("Informe o modelo do veiculo: ");
				modelo = ler.next();
				
				System.out.println("Digite o valor do veiculo: ");
				valorC = ler.nextFloat();
				
				System.out.println("Informe o nome do cliente: ");
				nome = ler.next();
				
				System.out.println("Digite o valor em caixa do cliente: ");
				valor = ler.nextFloat();
				
				Carro carro = new Carro(modelo, valorC);
				Cliente cliente = new Cliente(nome, valor);
				
				aluguel = new Aluguel(cliente, carro);
				
				aluguel.Alugar();
				
					
			}else if(op == 3) {
				System.out.println("Digite o CNPJ: ");
				cnpj = ler.nextInt();
				System.out.println("Informe a razão social: ");
				razao = ler.next();
				
				loja loja1 = new loja(cnpj, razao);
				
				System.out.println("\nRealizando Compra!!");
				loja1.realizarCompra();
				
				System.out.println("\nRealizando Venda!!");
				loja1.realizarVenda();
			}
			
		}while(op!=4);
	}
}


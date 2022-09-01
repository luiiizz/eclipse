/**
 * 
 */
package aplicacao;

import java.io.IOException;
import java.util.Scanner;

import estoque.compras;
import estoque.retirada;
import financeiro.contasPagar;
import financeiro.contasReceber;

/**
 * @author 55629
 *
 */
public class principal {

	private static Scanner ler;

	public static void main(String[] args) throws InterruptedException, IOException {
		int estoque = 0;
		float caixa = 0;
		
		ler = new Scanner(System.in);
		
		System.out.println("Selecione a operação: "
				+ "\n1. Pagar Conta"
				+ "\n2. Receber Conta"
				+ "\n3. Comprar"
				+ "\n4. Retirar"
				+ "\n5. Sair"
				+ "\n\nDigite uma opção: ");
		int op = ler.nextInt();
		
		while(op != 0 || op != 5) {
			
			if (op == 1){
				System.out.println("Digite o valor da conta: ");
				float valor = ler.nextFloat();
				
				contasPagar c1 = new contasPagar(op, valor);
				caixa = c1.atualizarCaixa(caixa);
			}
			
			else if (op == 2){
				System.out.println("Digite o valor da conta: ");
				float valor = ler.nextFloat();
				
				contasReceber c2 = new contasReceber(op, valor);
				caixa = c2.atualizarCaixa(caixa);
			}
			else if (op == 3) {
				System.out.println("Digite a quantidade comprada: ");
				int qtd = ler.nextInt();
				
				compras compra1 = new compras(null, 0,'a', qtd);
				
				estoque = compra1.atualizarEstoque(estoque);
			}
			else if (op == 4) {
				System.out.println("Digite a quantidade retirada: ");
				int qtd = ler.nextInt();
				
				retirada compra2 = new retirada(null, qtd);
				
				estoque = compra2.atualizarEstoque(estoque);
			}
			
			/*if (System.getProperty("os.name").contains("Windows"))
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        else
	            Runtime.getRuntime().exec("clear");*/
				                  
				System.out.println("\n\nSelecione a operação: "
						+ "\n1. Pagar Conta"
						+ "\n2. Receber Conta"
						+ "\n3. Comprar"
						+ "\n4. Retirar"
						+ "\n5. Sair"
						+ "\n\nDigite uma opção: ");
				op = ler.nextInt();
			
		}
	}
	
}

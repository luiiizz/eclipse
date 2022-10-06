package Info_Instutuicao;

import Agendamento.Agendamento;

public class Instituicao {
	public int CNPJ;
	public String Razao_Social;
	public String Cidade;
	public String CEP;
	public String Complemento;
	public String Bairro;
	public int Numero;
	Agendamento Agendamento;
	
	public Instituicao(int cNPJ, String razao_Social, String cidade, Agendamento agendamento) {
		super();
		CNPJ = cNPJ;
		Razao_Social = razao_Social;
		Cidade = cidade;
		Agendamento = agendamento;
	}	
	public void receber_Agendamento(){
		System.out.println("Agendamento Recebido");
	}
	public void confirmar_Agendamento(int Id_Agendamento){
		System.out.println("Agendamento Confirmado");
		
	}
}

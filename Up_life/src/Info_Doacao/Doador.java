package Info_Doacao;

import Agendamento.Agendamento;

public class Doador {
	public int CPF;
	public String Nome;
	public String E_mail;
	public String Data_Nascimento;
	public boolean Doenca_Infecciosa;
	public String Tipo_Sanguineo;
	Agendamento agendamento;
	
	public Doador(int cPF, String nome, String e_mail, String data_Nascimento, boolean doenca_Infecciosa,
			String tipo_Sanguineo) {
		super();
		CPF = cPF;
		Nome = nome;
		E_mail = e_mail;
		Data_Nascimento = data_Nascimento;
		Doenca_Infecciosa = doenca_Infecciosa;
		Tipo_Sanguineo = tipo_Sanguineo;
	}
	
	public void realizar_Agendamento(int Id, String Data_Hora) {
		Agendamento agend = new Agendamento(Id, Data_Hora);
		System.out.println("Agendamento Nº"+ Id + "realizado com sucesso");
	}

}

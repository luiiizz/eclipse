package Agendamento;

import Info_Doacao.Medicamento;

public class Agen_Medicamento {

	Agendamento Agendamento;
	Medicamento Medicamento;
	
	public Agen_Medicamento(Agendamento agendamento, Info_Doacao.Medicamento medicamento) {
		super();
		Agendamento = agendamento;
		Medicamento = medicamento;
	}
	
	public void exibir_Agendamento(){
		System.out.println("Agendamento Nº: \n" + Agendamento.Id_agendamento
				+ "Data/Hora: " + Agendamento.Data_Hora
				+ "Medicamento Nº: " + Medicamento.Id_Medicamento);
	}

}

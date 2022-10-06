package Agendamento;

public class Agend_Sangue {
	Agendamento Agendamento;
	public boolean Requisitos;
	
	public Agend_Sangue(Agendamento agendamento, boolean requisitos) {
		super();
		Agendamento = agendamento;
		Requisitos = requisitos;
	}
	
	public void exibir_Agendamento(){
		System.out.println("Agendamento Nº: \n" + Agendamento.Id_agendamento
				+ "Data/Hora: " + Agendamento.Data_Hora);
		
		if(Requisitos == true) {
			System.out.println("\nEm condições de realizar doação");
		}else {
			System.out.println("\nNão poderá Doar");
		}
	}

}

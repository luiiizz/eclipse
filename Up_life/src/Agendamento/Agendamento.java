package Agendamento;

public class Agendamento {
	
	public int Id_agendamento;
	public String Data_Hora;
	
	
	public Agendamento(int id_agendamento, String data_Hora) {
		super();
		Id_agendamento = id_agendamento;
		Data_Hora = data_Hora;
	}

	
	public int getId_agendamento() {
		return Id_agendamento;
	}

	public void setId_agendamento(int id_agendamento) {
		Id_agendamento = id_agendamento;
	}

	public String getData_Hora() {
		return Data_Hora;
	}

	public void setData_Hora(String data_Hora) {
		Data_Hora = data_Hora;
	}

	public void exibir_Agendamento(){
		System.out.println("Agendamento Nº: \n" + Id_agendamento
				+ "Data/Hora: " + Data_Hora);
	}
	
	
}


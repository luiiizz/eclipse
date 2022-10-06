package Info_Doacao;

public class Medicamento {
	public int Id_Medicamento;
	public String nome;
	public String Data_Validade;
	public int Fator_Risco;
	public float Valor;
	public boolean Manipulado;
	
	
	public Medicamento(int id_Medicamento, String nome, String data_Validade, 
		int fator_Risco, float valor,boolean manipulado) {
		
		super();
		Id_Medicamento = id_Medicamento;
		this.nome = nome;
		Data_Validade = data_Validade;
		Fator_Risco = fator_Risco;
		Valor = valor;
		Manipulado = manipulado;
	}		

	public void exibir_Medicamento(){
		System.out.println("Medicamento Nº: \n" + Id_Medicamento
				+ "Nome: " + nome
				+ "Nome: " + nome
				+ "Data Validade: " + Data_Validade
				+ "Fator Risco: " + Fator_Risco
				+ "Valor: " + Valor
				+ "Manipulado: " + Manipulado);
	}
	
}

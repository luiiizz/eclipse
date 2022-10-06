package Info_Instutuicao;


public class Estoque_Sangue {
	public int Id;
	public float Tipo_Bolsa;
	public String Data_Validacao;
	public String Tipo_Sanguineo;
	
	
	public Estoque_Sangue(int id, float tipo_Bolsa, String data_Validacao, String tipo_Sanguineo) {
		super();
		
		Id = id;
		Tipo_Bolsa = tipo_Bolsa;
		Data_Validacao = data_Validacao;
		Tipo_Sanguineo = tipo_Sanguineo;
		
	}
	
	
	public void report(){
		int total;
		
		total = (int) (Tipo_Bolsa * Id);
		System.out.println("Quantidade em estoque: " + total);
	}
	
}

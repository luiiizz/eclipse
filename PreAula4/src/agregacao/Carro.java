package agregacao;

public class Carro {
	public String Modelo;
	public float Valor;
	
	public Carro(String modelo, float valor) {
		super();
		Modelo = modelo;
		Valor = valor;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public float getValor() {
		return Valor;
	}

	public void setValor(float valor) {
		Valor = valor;
	}
	
	

}

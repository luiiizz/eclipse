package associacao;

public class Laptop {
	public String marca;
	public int Ano_fabricacao;
	Screen tela;
	
	
	public Laptop(String marca, int ano_fabricacao, Screen tela) {
		super();
		this.marca = marca;
		Ano_fabricacao = ano_fabricacao;
		this.tela = tela;
	}


	public void setTela(Screen tela) {
		this.tela = tela;
	}


	public String getMarca() {
		return marca;
	}

	public int getAno_fabricacao() {
		return Ano_fabricacao;
	}


	public Screen getTela() {
		return tela;
	}
	
	public void comprarlaptop() {
		System.out.println("\nLaptop Comprado:\n"
				+ "\nMarca: " + marca
				+"\nAno: " + Ano_fabricacao
				+"\nTela: " + tela.getAltura() + "x" + tela.getLargura()+"\n\n");
	}

}

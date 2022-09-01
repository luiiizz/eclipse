package associacao;

public class Screen {
	int altura;
	int largura;
	
	
	public Screen(int altura, int largura) {
		this.altura = altura;
		this.largura = largura;
	}


	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}


	public int getLargura() {
		return largura;
	}


	public void setLargura(int largura) {
		this.largura = largura;
	}
	
	public void quebrar(){
		System.out.println("Tela quebrada");
	}

}

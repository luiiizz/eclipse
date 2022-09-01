package Ex3;

public class Emprestimo {
	public int data_emprest;
	public int data_devol;
	public Pessoas pessoa;
	public Livro livro;
	
	public Emprestimo(int data_emprest, int data_devol, Pessoas pessoa, Livro livro) {
		super();
		this.data_emprest = data_emprest;
		this.data_devol = data_devol;
		this.pessoa = pessoa;
		this.livro = livro;
	}
	
}

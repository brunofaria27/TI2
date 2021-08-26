package principal;

public class Produto {
	private int codigo;
	private String nome;
	private double valor;
	private int estoque;
	
	public Produto() {
		this.codigo = -1;
		this.nome = "";
		this.valor = -1.0;
		this.estoque = -1;
	}
	
	public Produto(int codigo, String nome, double valor, int estoque) {
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		this.estoque = estoque;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidadeEstoque() {
		return estoque;
	}

	public void setQuantidadeEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public String toString() {
		String mensagem = "Produto -> Código: " + codigo + "\n" + "Nome: " + nome + "\n" + "Valor: " + valor + "\n" + "Quantidade em estoque: " + estoque;
		return mensagem;
	}
	
}

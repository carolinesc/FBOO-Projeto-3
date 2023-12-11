package Delivery_Caroline_Schiavo;

public class Produto extends ProdutoPedido {
	
	private String nome;
	private Categoria categoria;
	private double preco;
	
	public Produto() {
		
	}
	public Produto(String nome, Categoria categoria, double preco) {
		this.nome = nome;
		this.categoria = categoria;
		this.preco = preco;
	}
	

	public String getNome() {
		return super.getNome();
	}

	public void setNome(String nome) {
		super.setNome(nome);
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}

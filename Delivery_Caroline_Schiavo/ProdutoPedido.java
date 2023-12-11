package Delivery_Caroline_Schiavo;

public class ProdutoPedido extends Pedido{
	
	private String produto;
	private int quantidade;
	
	public ProdutoPedido() {
		
	}
	public ProdutoPedido(String produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}

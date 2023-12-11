package Delivery_Caroline_Schiavo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido extends Cliente {
	private Cliente cliente;
	private List<ProdutoPedido> lista;
	private String endereco;
	private double taxaEntrega;
	private double valor;
	private String formaPagamento;
	private double troco;
	private Date data;
	private int horario;
	
	public Pedido() {
		
	}
	public Pedido(Cliente cliente, List<ProdutoPedido> lista, String endereco, double taxaEntrega,
			double valor, String formaPagamento, double troco, Date data, int horario) {
		this.cliente = cliente;
		this.lista = lista;
		this.endereco = endereco;
		this.taxaEntrega = taxaEntrega;
		this.valor = valor;
		this.formaPagamento = formaPagamento;
		this.troco = troco;
		this.data = data;
		this.horario = horario;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<ProdutoPedido> getLista() {
		return lista;
	}
	public void setLista(List<ProdutoPedido> lista) {
		this.lista = lista;
	}
	@Override
	public String getEndereco() {
		// TODO Auto-generated method stub
		return super.getEndereco();
	}
	@Override
	public void setEndereco(String endereco) {
		// TODO Auto-generated method stub
		super.setEndereco(endereco);
	}
	public double getTaxaEntrega() {
		return taxaEntrega;
	}
	public void setTaxaEntrega(double taxaEntrega) {
		taxaEntrega = 6;
		this.taxaEntrega = taxaEntrega;
		
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public double getTroco() {
		return troco;
	}
	public void setTroco(double troco) {
		this.troco = troco;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getHorario() {
		return horario;
	}
	public void setHorario(int horario) {
		this.horario = horario;
	}
	
}

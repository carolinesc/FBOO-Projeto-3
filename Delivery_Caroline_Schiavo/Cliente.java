package Delivery_Caroline_Schiavo;

public class Cliente extends Pessoa {
	private String endereco;
	private double telefone;
	
	public Cliente() {
		
	}
	public Cliente(String endereco, double telefone) {
		this.endereco = endereco;
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getTelefone() {
		return telefone;
	}
	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}
	@Override
	public String getNome() {
		return super.getNome();
	}
	@Override
	public void setNome(String nome) {
		super.setNome(nome);
	}
	@Override
	public double getCep() {
		return super.getCep();
	}
	@Override
	public void setCep(double cep) {
		super.setCep(cep);
	}
	public void fazerPedido() {
		
	}
	public void fazerLogin() {
		
	}
}

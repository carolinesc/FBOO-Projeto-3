package Delivery_Caroline_Schiavo;

public class Motoboy {
	 
	private String nome;
	
	public Motoboy() {
		
	}
	public Motoboy(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void entregar() {
		System.out.println("O motoboy saiu para a entrega!");
	}
}

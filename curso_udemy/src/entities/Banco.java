package entities;

public class Banco {
	
	private final int idConta;
	private String nomeTitular;
	private double valorNoBanco;
	
	public Banco(int idConta, String nomeTitular) {
		
		this.idConta = idConta;
		this.nomeTitular = nomeTitular;
	}
	
	public Banco(int idConta, String nomeTitular, double valorNoBanco) {
		
		this.idConta = idConta;
		this.nomeTitular = nomeTitular;
		Depositar(valorNoBanco);
		
	}
	
	public int getIdConta() {
		
		return idConta;
		
	}
	
	public String getNomeTitular() {
		
		return nomeTitular;
		
	}
	
	public void setNomeTitular(String nomeTitular) {
		
		this.nomeTitular = nomeTitular;
		
	}
	
	public double getValorNoBanco() {
		
		return valorNoBanco;
		
	}
	
	public void Depositar(double valor) {
		
		this.valorNoBanco += valor;
		
	}
	
	public void Retirar(double valor) {
		
		this.valorNoBanco -= valor;
		this.valorNoBanco -= 5.0;
	}
	
	public String toString() {
		
		return String.format("Conta número %d, titular: %s, Saldo: $ %.2f", idConta, nomeTitular, valorNoBanco);
		
	}
}
	
	

	
	

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class CadastroBanco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Banco contaNova;
		double valorNoBanco = 0;
		System.out.println("Diga o ID da conta: ");
		int idConta = sc.nextInt();
		sc.nextLine();
		System.out.println("Diga o nome do dono da conta: ");
		String nomeTitular = sc.nextLine();
		System.out.println("Há um depósito inicial na conta? S/N ");
		char depositoInicial = sc.next().charAt(0);
		if (depositoInicial == 'S') {
			
			System.out.println("Entre com o valor do depósito inicial: ");
			valorNoBanco = sc.nextDouble();
			contaNova = new Banco(idConta, nomeTitular, valorNoBanco);
		}
		else {
			
			contaNova = new Banco(idConta, nomeTitular);
			
		}
		
		System.out.println(contaNova);
		
		System.out.println();
		
		System.out.println("Entre um valor de retirada: ");
		double valorRetirado = sc.nextDouble();
		contaNova.Retirar(valorRetirado);
		System.out.println("Conta atualizada: ");
		System.out.println(contaNova);
		
		System.out.println("Entre um valor de depósito: ");
		double valorDepositado = sc.nextDouble();
		contaNova.Depositar(valorDepositado);
		System.out.println("Conta atualizada: ");
		System.out.println(contaNova);
		
		
		sc.close();
		

	}

}

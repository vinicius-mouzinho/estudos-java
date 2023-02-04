package Exercicios;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		
		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			
			System.out.printf("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.printf("VALORES = ");
		
		for(int i = 0; i < n; i++) {
			
			System.out.printf("%.2f  ", vect[i]);
			soma += vect[i];
		}
		
		System.out.println();
		System.out.println("SOMA = " + soma);
		
		double media = soma / n;
		
		System.out.println("MEDIA = " + media);
		
		sc.close();

	}

}

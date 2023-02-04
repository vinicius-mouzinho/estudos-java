package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		int aux = 1;
		
		for (int i = 0; i < n; i++) {
			
			System.out.printf("Dados da %da pessoa: ", aux);
			System.out.println();
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
			
			aux += 1;
			
		}
		
		double somaAlturas = 0;
		
		for (int i = 0; i < n; i++) {
			
			somaAlturas += alturas[i];
			
		}
		
		double mediaAlturas = somaAlturas / n;
		
		System.out.printf("Altura média: %.2f\n", mediaAlturas);
		
		int numPessoasMenoresDe16 = 0;
		
		
		for (int i = 0; i < n; i++) {
				
			if (idades[i] < 16) {
				
				numPessoasMenoresDe16++;
			}
			
			
		}
		
		double percentualMenoresDe16 = ((double)numPessoasMenoresDe16 / n) * 100.0;
		
		System.out.printf("Pessoas menores de 16: %.1f%%\n", percentualMenoresDe16);
		
		for(int i = 0; i < n; i++) {
			
			if(idades[i] < 16) {
				
				System.out.println(nomes[i]);
				
			}
			
			
		}
		
		
		sc.close();
		
	}
	
	
	
}

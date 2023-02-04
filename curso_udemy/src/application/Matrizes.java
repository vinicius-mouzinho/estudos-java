package application;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			
			for(int j = 0; j < n; j++) {
				
				mat[i][j] = sc.nextInt();
				
			}
			
		}
		
		System.out.println("Main diagonal: ");
		
		for(int i = 0; i < n; i++) {
			
			for(int j = 0; j < n; j++) {
				
				if(i == j) {
					
					System.out.print(mat[i][j] + " ");
					
				}
				
			}
			
		}
		
		System.out.println();
		
		int negatives_count = 0;
		
		for(int i = 0; i < n; i++) {
			
			for(int j = 0; j < n; j++) {
				
				if(mat[i][j] < 0) {
					
					negatives_count += 1;
					
				}
				
			}
			
		}
		
		System.out.printf("Negative numbers = %d", negatives_count);
		
		sc.close();

	}

}
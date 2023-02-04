package Exercicios;
import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Pensionato {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms wil be rented? ");
		int num_rooms = sc.nextInt();
		sc.nextLine();
		
		Student[] vect = new Student[10];
		
		
		for(int i = 0; i < num_rooms; i++) {
			
			System.out.printf("Rent #%d:\n", i+1);
			System.out.printf("Name: ");
			String name = sc.nextLine();
			System.out.printf("Email: ");
			String email = sc.nextLine();
			System.out.printf("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			
			vect[room] = new Student(name, email);
			
		}
		
		System.out.println("Busy rooms: ");
		
		for(int i = 0; i < 10; i++) {
			
			if(vect[i] != null) {
				
				System.out.printf("%d: %s\n", i, vect[i].toString());
				
			}
		}
		
		
		sc.close();
		

	}

}

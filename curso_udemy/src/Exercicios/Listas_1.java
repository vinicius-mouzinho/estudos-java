package Exercicios;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;



public class Listas_1 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int id;
		String name;
		Double salary;
		
		System.out.println("How many employees will be registered? ");
		int num_employees = sc.nextInt();
		sc.nextLine();
		
		List<Employee> list = new ArrayList<>();
		
		for(int i = 0; i < num_employees; i++) {
			
			System.out.printf("Employee #%d\n", i+1);
			System.out.println("Id: ");
			id = sc.nextInt();
			sc.nextLine();
			while(hasId(list, id)) {
				
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			System.out.println("Name: ");
			name = sc.nextLine();
			System.out.println("Salary: ");
			salary = sc.nextDouble();
			sc.nextLine();
			System.out.println();
			Employee emp = new Employee(name, id, salary);
			
			list.add(emp);
			
		}
		
		System.out.println("Enter the employee id that will have a salary increase: ");
		int idsalary = sc.nextInt();
		Integer pos = position(list, idsalary);
		if (pos == null) {
			
			System.out.println("This id does not exist!");
			
		}
		else {
			
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
			
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for(Employee emp: list) {
			
			System.out.println(emp);
			
		}
		
		sc.close();

	}

		public static Integer position(List<Employee> list, int id) {
			
			for (int i = 0; i < list.size(); i++) {
				
				if(list.get(i).getId() == id) {
					
					return i;
				}
				
			}
			
			return null;
	}
		
		public static boolean hasId(List<Employee> list, int id) {
			Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			return emp != null;
			
		}

}

package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class UpcastingDowncasting {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING - Passar businessaccount pra account
		
		Account acc1 = bacc; // Podemos fazer uma BusinessAccount ser um objeto do tipo Acount
		// Pois uma BusinessAccount também é uma Account
		
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// Ou seja, é perfeitamente normal atribuir um objeto de alguma subclasse
		// e atribui-lo para uma variável da superclasse.
		
		// DOWNCASTING
		
		// Temos que especificar o tipo do objeto 
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// ERRO = BusinessAccount acc5 = (BusinessAccount)acc3
		
		if(acc3 instanceof BusinessAccount) {
			
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
			
		}
		
		if(acc3 instanceof SavingsAccount) {
			
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
			
		}
		
		System.out.println(acc1);
		System.out.println(acc);

	}

}

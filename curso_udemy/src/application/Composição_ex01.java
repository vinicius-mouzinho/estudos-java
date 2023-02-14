package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Client_2;
import entities.OrderItem_2;
import entities.Product_2;

public class Composição_ex01 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product_2 p = new Product_2("TV", 1000.0);
		
		OrderItem_2 oi1 = new OrderItem_2(1, 1000.0, p);
		
		// System.out.println(oi1.getProduct().getName()); 
		// caso quiséssemos pegar o nome do produto dentro de oi1
		
		System.out.println(oi1);
		
		Client_2 cli = new Client_2("Maria", "maria@gmail.com", sdf.parse("20/10/1995"));
		
		System.out.println(cli);
		
		sc.close();

	}

}

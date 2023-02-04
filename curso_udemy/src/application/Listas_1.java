package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas_1 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		// Para colocar novo item na posição 2
		list.add(2, "Marco");
		
		
		for (String x : list) {
			
			System.out.println(x);
			
		}
		
		System.out.println("------------------");
		
		list.remove(2);
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			
			System.out.println(x);
			
		}
		
		System.out.println("------------");
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Bob: " + list.indexOf("Marco"));
		// Retorna -1 pois o elemento não está na lista
		
		System.out.println("----------");
		
		
		//Tipo stream aceita expressões lambda
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		
		for (String x : result) {
			
			System.out.println(x);
			
		}
	}

}

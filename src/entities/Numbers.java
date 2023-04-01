package entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Numbers {

	private LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
	private LinkedHashSet<Integer> random = new LinkedHashSet<>();
	
	public Numbers() {
	}
	

	public Numbers(LinkedHashSet<Integer> numbers, LinkedHashSet<Integer> random) {
		this.numbers = numbers;
		this.random = random;
	}
	

	public LinkedHashSet<Integer> getNumbers() {
		return numbers;
	}
	
	
	public LinkedHashSet<Integer> getRandom() {
		return random;
	}


	public void add_numbers(Integer n) {
		
		if (numbers.contains(n)) {
				System.out.println("Você já informou esse número.");
		}
		else {
			numbers.add(n);
		}	
	}
	
	
	public LinkedHashSet<Integer> ramdom_numbers() {
	
		for(int i = 0; random.size() < 4; i++) {
			int numRandom = (int)(Math.random() * 9 ) + 1;
			random.add(numRandom);
		}
		return random;
	}
	
	public Integer correct_numbers() {
		int cont_correct = 0;
		for(Integer x: numbers) {
			if(random.contains(x)) {
				cont_correct++;
			}
		}
		return cont_correct;
	}
	
	public Integer position() {
		int vector1[] = new int[4]; 
		int vector2[] = new int[4]; 
		int cont = 0, i = 0;
		
		for(Integer x : numbers) {
			vector1[i] = x;
			i++;
		}
		
		i = 0;
		for(Integer r : random) {
			vector2[i] = r;
			i++;
		}
		
		for(int j = 0; j < 4; j++) {
			if(vector1[j] == vector2[j]) {
				cont++;
			}
		}
		
		return cont;
	}
	
	
	public void removeAll() {
		numbers.removeAll(numbers);
	}


	
	public String to_string() {
		String s = "";
		for(Integer r : random) {
			s += "" +r;
		}
		return s;
	}
	
}







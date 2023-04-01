package application;

import java.util.Scanner;

import entities.Numbers;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Numbers number = new Numbers();
		int n, tentativa = 1;

		number.ramdom_numbers();

		try {
			while (tentativa <= 10 && number.position() != 4) {

				System.out.println("Tentativa " + tentativa + " de 10!");
				for (int i = 0; number.getNumbers().size() < 4; i++) {
					System.out.print("Digite um número: ");
					n = leia.nextInt();
					number.add_numbers(n);
				}
				System.out.print("\nSeu palpite: ");

				for (Integer t : number.getNumbers()) {
					System.out.print(t);
				}

				System.out.println(" | Números corretos: " + number.correct_numbers() + " |  Posições corretas: "
						+ number.position());

				if (number.position() != 4) {
					number.removeAll();
				}
				tentativa++;
			}
			
			if(number.position() == 4) {
				System.out.println("Você ganhou!! O número era: " +number.to_string());
			}
			else {
				System.out.println("Você perdeu!! O número era: " +number.to_string());
			}
		} 
		catch (Exception e) {
			System.out.println("Erro! " + e.getMessage());
		}

		leia.close();
	}

}

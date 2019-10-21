package co.grandcircus;

import java.util.Scanner;

public class Assessment {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int userInput = 0;
		double burger = 2.5;
		double soda = 1.25;
		double subtotal = 0;
		double tax = 0;
		double total = 0;
		String totalAsterisk = "*";
		
		do {
		
		System.out.println("1. Burger");
		System.out.println("2. Soda");
		System.out.println("3. Exit");
		
		System.out.println("\nSelect an option: ");
		userInput = scan.nextInt();
		

		
		if (userInput == 1) {
			burger++;
			totalAsterisk = totalAsterisk + "*";
			
		} else if (userInput == 2) {
			soda++;
			totalAsterisk = totalAsterisk + "*";
		} else if (userInput !=3) {
			System.out.println("Sorry I didn't understand, let's try again.");
		}
		
		} while (userInput !=3);

		subtotal = burger + soda;
		System.out.println("Subtotal: " + subtotal);
		
		
		tax = (subtotal * 0.07);
		
		total = subtotal + tax;
		System.out.println("Total: " + total);
		
		System.out.println("Burgers: " + totalAsterisk);
		System.out.println("Sodas: " + totalAsterisk);
		
		scan.close();
		
	}

}

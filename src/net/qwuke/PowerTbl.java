package net.qwuke;

import java.util.Scanner;

public class PowerTbl {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String valid = " "; // String for validating whether or not to continue

		do {
			System.out.println("Learn your squares and cubes!");
			System.out.println("Enter an integer: ");
			while (!sc.hasNextInt()) {
				sc.next(); // Handles the non double then waits for the next input, stopping an infinite
							// angry messages/hang and exception simultaneously
				System.out.println("That wasn't an int! Try entering another value: ");
			}
			int input = sc.nextInt();
			// Now to print out the formatted tables
			String sep = "=======";
			System.out.format("%10s%10s%10s", "Number", "Squared", "Cubed");
			System.out.println("");
			System.out.format("%10s%10s%10s", sep, sep, sep);
			System.out.println("");

			for (int i = 1; input >= i; i++) {
				System.out.format("%10d%10d%10d", i, i * i, i * i * i);
				System.out.println("");

			}
			sc.nextLine();
			System.out.println("");
			System.out.println("Continue? Type y to continue or n to end the program");
			valid = sc.nextLine();
			while (!(valid.equals("y") || valid.equals("Y") || valid.equals("n") || valid.equals("N"))) {
				System.out.println("That wasn't a valid input! Type y to continue or n to stop");
				valid = sc.nextLine();
			}
		} while (valid.equals("y") || valid.equals("Y")); // If y, rerun the program
		sc.close();
	}

}

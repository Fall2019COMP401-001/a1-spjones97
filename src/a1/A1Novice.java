package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int customers = scan.nextInt();
		for (int i = 0; i < customers; i++) {
			String firstName = scan.next();
			char firstInitial = firstName.charAt(0);
			String lastName = scan.next();
			int itemNumber = scan.nextInt();
			double total = 0;
			for (int j = 0; j < itemNumber; j++) {
				int amount = scan.nextInt();
				String itemName = scan.next();
				double cost = scan.nextDouble();
				total += amount * cost;
			}
			System.out.println(firstInitial + ". " + lastName + ": " + String.format("%.2f", total));
		}

		scan.close();
	}
}

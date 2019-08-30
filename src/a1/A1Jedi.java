package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int amountOfItems = scan.nextInt();
		int[] itemsPurchased = new int[amountOfItems];
		String[] itemNames = new String[amountOfItems];
		int[] customerPurchase = new int[amountOfItems];
		for (int i = 0; i < amountOfItems; i++) {
			String itemName = scan.next();
			itemNames[i] = itemName;
			double itemCost = scan.nextDouble();
			itemsPurchased[i] = 0;
			customerPurchase[i] = 0;

		}
		int customerAmount = scan.nextInt();
		for (int i = 0; i < customerAmount; i++) {
			String firstName = scan.next();
			String lastName = scan.next();
			int amountItems = scan.nextInt();
			String[] customerList = new String[amountItems];
			for (int j = 0; j < amountItems; j++) {
				int itemNumber = scan.nextInt();
				String item = scan.next();
				for (int k = 0; k < amountOfItems; k++) {
					if (item.equals(itemNames[k])) {
						itemsPurchased[k] += itemNumber;
						customerPurchase[k] += 1;
					}
				}
				for (int l = 0; l < amountItems; l++) {
					if (item.equals(customerList[l])) {
						customerPurchase[l] -= 1;
					}
				}
			}
		}
		for (int i = 0; i < amountOfItems; i++) {
			if (customerPurchase[i] == 0) {
				System.out.println("No customers bought " + itemNames[i]);
			} else {
				System.out.println(customerPurchase[i] + " customers bought " + itemsPurchased[i] + " " + itemNames[i]);
			}
		}
		scan.close();
	}
}

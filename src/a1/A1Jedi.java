package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int itemAmount = scan.nextInt();
		String[] itemNames = new String[itemAmount];
		int[] itemAmountPurchased = new int[itemAmount];
		for (int i = 0; i < itemAmount; i++) {
			String itemName = scan.next();
			itemNames[i] = itemName;
			double cost = scan.nextDouble(); // Disregard
		}

		int customerAmount = scan.nextInt();
		int[] customerItemsPurchased = new int[itemAmount];
		for (int i = 0; i < customerAmount; i++) {
			String firstName = scan.next(); // Disregard
			String lastName = scan.next(); // Disregard
			int customerItemsAmount = scan.nextInt();
			String[] customerList = new String[customerItemsAmount];
			for (int j = 0; j < customerItemsAmount; j++) {
				int itemNumber = scan.nextInt();
				String item = scan.next();
				if (exists(item, customerList)) {
					for (int k = 0; k < itemAmount; k++) {
						if (item.equals(itemNames[k])) {
							itemAmountPurchased[k] += itemNumber;
						}
					}
				} else {
					for (int k = 0; k < itemAmount; k++) {
						if (item.equals(itemNames[k])) {
							itemAmountPurchased[k] += itemNumber;
							customerItemsPurchased[k] += 1;
						}
					}
				}
				customerList[j] = item;
			}
		}

		for (int i = 0; i < itemAmount; i++) {
			if (customerItemsPurchased[i] == 0) {
				System.out.println("No customers bought " + itemNames[i]);
			} else {
				System.out.println(customerItemsPurchased[i] + " customers bought " + itemAmountPurchased[i] + " " + itemNames[i]);
			}
		}

		scan.close();
	}
	static boolean exists(String item, String[] list) {
		for (int i = 0; i < list.length; i++) {
			if (item.equals(list[i])) {
				return true;
			}
		}
		return false;
	};
};

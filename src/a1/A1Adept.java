package a1;                                                                                                            
                                                                                                                       
import java.util.Scanner;                                                                                              
                                                                                                                       
public class A1Adept {                                                                                                 
                                                                                                                       
	public static void main(String[] args) {                                                                           
                                                                                                                       
		Scanner scan = new Scanner(System.in);                                                                         
                                                                                                                       
		// Your code follows here.                                                                                     
		int itemAmount = scan.nextInt();                                                                               
		String[] itemNames = new String[itemAmount];                                                                   
		double[] itemCosts = new double[itemAmount];                                                                   
		for (int i = 0; i < itemAmount; i++) {                                                                         
			String item = scan.next();                                                                                 
			itemNames[i] = item;                                                                                       
			double cost = scan.nextDouble();                                                                           
			itemCosts[i] = cost;                                                                                       
		}                                                                                                              
                                                                                                                       
		int customers = scan.nextInt();                                                                                
		String[] firstNames = new String[customers];                                                                   
		String[] lastNames = new String[customers];                                                                    
		double[] customerTotals = new double[customers];                                                               
		double total = 0.0;                                                                                            
		for (int i = 0; i < customers; i++) {                                                                          
			String firstName = scan.next();                                                                            
			firstNames[i] = firstName;                                                                                 
			String lastName = scan.next();                                                                             
			lastNames[i] = lastName;                                                                                   
			int itemNumber = scan.nextInt();                                                                           
			for (int j = 0; j < itemNumber; j++) {                                                                     
				int itemAmounts = scan.nextInt();                                                                      
				String itemName = scan.next();                                                                         
				for (int k = 0; k < itemNames.length; k++) {                                                           
					if (itemName.equals(itemNames[k])) {                                                               
						total = total + (itemCosts[k] * itemAmounts);                                                  
					}                                                                                                  
				}                                                                                                      
			}                                                                                                          
			customerTotals[i] = total;                                                                                 
			total = 0.0;                                                                                               
		}                                                                                                              
		double biggestTotal = Integer.MIN_VALUE;                                                                       
		String biggestTotalName = "";                                                                                  
		for (int i = 0; i < customers; i++) {                                                                          
			if (customerTotals[i] > biggestTotal) {                                                                    
				biggestTotal = customerTotals[i];                                                                      
				biggestTotalName = firstNames[i] + " " + lastNames[i];                                                 
			}                                                                                                          
		}                                                                                                              
		double smallestTotal = Integer.MAX_VALUE;                                                                      
		String smallestTotalName = "";                                                                                 
		for (int i = 0; i < customers; i++) {                                                                          
			if (customerTotals[i] < smallestTotal) {                                                                   
				smallestTotal = customerTotals[i];                                                                     
				smallestTotalName = firstNames[i] + " " + lastNames[i];                                                
			}                                                                                                          
		}                                                                                                              
		double averageTotal = 0;                                                                                       
		for (int i = 0; i < customers; i++) {                                                                          
			averageTotal += customerTotals[i];                                                                         
		}                                                                                                              
		averageTotal = averageTotal / customers;                                                                       
                                                                                                                       
		System.out.println("Biggest: " + biggestTotalName + " (" + String.format("%.2f", biggestTotal) + ")");         
		System.out.println("Smallest: " + smallestTotalName + " (" + String.format("%.2f", smallestTotal) + ")");      
		System.out.println("Average: " + String.format("%.2f", averageTotal));                                         
                                                                                                                       
		scan.close();                                                                                                  
                                                                                                                       
	}                                                                                                                  
}                                                                                                                                                                                                                                                                                                                                                         

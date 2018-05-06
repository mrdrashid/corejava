package corejava;

import java.util.Scanner;

public class ConvertEuroDollar {
	
	public static void main(String[] args) {
		
	double EuroAmount;
	// User Input of Euro Amount
	Scanner in = new Scanner(System.in);	
	System.out.print("Enter the amount of Euro:");
	EuroAmount = in.nextDouble(); // Store the Euro Amount
	
	double calculateDollar = (1.24*EuroAmount); // Convert to US Dollar Amount
	
	// Display the US Dollar Amount in Console
	System.out.println("Finally, the total amount of Dollar is = " + calculateDollar);
	
	}	  
}   
	
     
	




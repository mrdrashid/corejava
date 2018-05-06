package SiriProgram;

import java.util.Scanner;

public class SiriPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringArray obj1=new StringArray();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the selected number that you would like to get service:");
		
		int productNumber;
		productNumber = input.nextInt(); // Store the product number
		switch (productNumber) {

		case 1:

			System.out.println("You Selected contact name information:");

			

			break;

		case 5422:

			System.out.println("You Selected PoloShirt:");

			

			break;

		case 5423:

			System.out.println("You Selected DellLaptop:");


			break;

		case 5424:

			System.out.println("You Selected RadoWatch:");

			

			break;

		case 5425:

			System.out.println("You Selected Eternity:");

			

			break;

		default:

			System.out.println("We are very sorry, this product is not available at this time frame.");
			System.out.println("Please check back later,Thank you!");

			break;


	}

}

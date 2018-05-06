package corejava;

import java.util.Scanner;

public class ProductPriceChecker {

	public static void main(String[] args) {
		// Create the object for all of these following products

		TotalProductPrice NIKEShoe = new TotalProductPrice();
		TotalProductPrice PoloShirt = new TotalProductPrice();
		TotalProductPrice DellLaptop = new TotalProductPrice();
		TotalProductPrice RadoWatch = new TotalProductPrice();
		TotalProductPrice Eternity = new TotalProductPrice();

		// User input for product selection

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the bar code that you are looking for:");
		int productNumber;
		productNumber = input.nextInt(); // Store the product number
		switch (productNumber) {

		case 5421:

			System.out.println("You Selected NIKE Shoe:");

			NIKEShoe.cost = 60;
			NIKEShoe.tax = (60 * .0825);
			NIKEShoe.calculateTotalPay();

			break;

		case 5422:

			System.out.println("You Selected PoloShirt:");

			PoloShirt.cost = 85;
			PoloShirt.tax = (85 * .0825);
			PoloShirt.calculateTotalPay();

			break;

		case 5423:

			System.out.println("You Selected DellLaptop:");

			DellLaptop.cost = 750;
			DellLaptop.tax = (750 * .0825);
			DellLaptop.calculateTotalPay();

			break;

		case 5424:

			System.out.println("You Selected RadoWatch:");

			RadoWatch.cost = 450;
			RadoWatch.tax = (450 * .0825);
			RadoWatch.calculateTotalPay();

			break;

		case 5425:

			System.out.println("You Selected Eternity:");

			Eternity.cost = 75;
			Eternity.tax = (75 * .0825);
			Eternity.calculateTotalPay();

			break;

		default:

			System.out.println("We are very sorry, this product is not available at this time frame.");
			System.out.println("Please check back later,Thank you!");

			break;

		}

	}

}

package SiriProgram;

import java.util.Scanner;

public class SiriTest {

	public static void main(String[] args ) {
	
		
		
		Scanner inputstring = new Scanner(System.in);
		System.out.print(" Enter ContactName:");
		String temp1;
		temp1 = inputstring.nextLine();
		switch (temp1) {

		case "thirty":
			System.out.println("You have select the contact name info.");
			ArrayName.ContactName();
			break;
		case "temp3":
			System.out.println("Weather is moderately cold");
			break;
		case "temp4":
			System.out.println("Weather is partly cloudy");
			break;
		case "temp5":
			System.out.println("Weather is sunshine");
			break;
		case "fiftyfive":
			System.out.println("It is raining");
			break;
		case "temp6":
			System.out.println("Weather is very nice and wonderful");
			break;
		default:
			System.out.println("I can not predict the weather");
			break;


		ArrayName obj1 = new ArrayName("Belal", 55, "male", "BSEE");
		ArrayName obj2 = new ArrayName("Rehana", 47, "Female", "MS HomeEconomics");
		ArrayName obj3 = new ArrayName("Ruby", 67, "Female", "BSEd");
		ArrayName obj4 = new ArrayName("Sirajam", 19, "Female", "HighSchool");
		ArrayName obj5 = new ArrayName("Tasnim", 15, "male", "High School");
	}
	}
}

	// obj1.ShoppingCenterInfo(w);
	// obj1.shoppingstore.toString();



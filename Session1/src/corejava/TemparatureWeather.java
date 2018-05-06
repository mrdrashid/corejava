package corejava;

import java.util.Scanner;

public class TemparatureWeather {
	static String temp[] = new String[6];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputstring = new Scanner(System.in);
		System.out.print(" Enter the temperature:");
		String temp1;
		temp1 = inputstring.nextLine();
		switch (temp1) {
		case "thirty":
			System.out.println("Weather is very cold");
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

		}
	}
}

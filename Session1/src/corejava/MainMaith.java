package corejava;

import java.util.Scanner;

public class MainMaith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MathFunc avalue = new MathFunc();

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value number :");
		double valueNumber;
		valueNumber = input.nextDouble();
		avalue.calculateSquare(valueNumber);

	}

}

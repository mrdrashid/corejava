package SiriProgram;

import java.util.Scanner;

public class SumSwapDigitNumber {

	public static void main(String[] args) {
		digitNumber();
		
	}
public static void digitNumber() {
		Scanner input = new Scanner(System.in);
		int r, r1, num, num1, sum1, temp, temp1, sum = 0;

		System.out.print(" Enter any number:");

		num = input.nextInt();
		// Argument for the reverse number
		temp = num;

		while (temp != 0) {

			r = temp % 10;
			sum = r + sum * 10;
			temp = temp / 10;

		}

		System.out.println(" Reverse digits are: " + sum);

		// Argument for the Palindrom
		if (num == sum) {
			System.out.println("The digits are palindrom");
		} else {

			System.out.println("The digits are not palindrom");
		}

		// Argument for the sum of the digits

		num1 = num;
		sum1 = 0;
		temp1 = num;
		while (temp1 != 0) {

			r1 = temp1 % 10;
			sum1 = r1 + sum1;
			temp1 = temp1 / 10;

		}

		System.out.println("Sum of the digits are: " + sum1);
	}

}

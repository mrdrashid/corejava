package corejava;

import java.util.Scanner;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStatic obj = new NonStatic();
		// ProductPriceChecker price =new ProductPriceChecker();
		//SumSwapDigitNumber();
		obj.flower();
		obj.car();
		country();
		state();
		age();
		addition(4, 5);
		massaddition(66, 67, 68, 69);
	}

	

	public static void country() {

		System.out.println("I am from mars");
	}

	public static void state() {
		System.out.println("I am from Texas");
	}

	public static void age() {

		int x = 9;
		System.out.println(x);
	}

	public static void addition(int a, int b) {
Scanner input =new Scanner(System.in);
System.out.println("Enter the first number:");
int number1 = input.nextInt();
System.out.println("Enter the Second number:");
int number2 = input.nextInt();
int add = a + b;

		System.out.println("The addition of these two numbers are: " +add);
	}

	public static void massaddition(int a, int b, int c, int d) {
		
		Scanner input1 =new Scanner(System.in);
		System.out.println("Enter the first number:");
		
	//	Scanner input1 = null;
		
		
		int number3 = input1.nextInt();
		System.out.println("Enter the second number:");
		int number4 = input1.nextInt();
		System.out.println("Enter the third number:");
		int number5 = input1.nextInt();
		System.out.println("Enter the forth number:");
		int number6 = input1.nextInt();
		//System.out.println("Enter the forth number:");
		 int add = a+b+c+d;
		//int multiply = a * b;
		// int div = a/d;
		System.out.println("Asdition of these numbers are: " +add);
		
	

}
}




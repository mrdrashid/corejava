package corejava;

import java.util.Scanner;

public class MainMathCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
MathFuncCube cvalue = new MathFuncCube();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value number :");
		double valueNumber;
		valueNumber = input.nextDouble();
		cvalue.calculateCube(valueNumber);
		//System.out.println("Cube for the value number is: "+calculateCube);

	}

}

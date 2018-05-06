package SiriProgram;

import java.util.Scanner;

import org.openqa.selenium.interactions.Interaction;

import corejava.Function;

import corejava.NextWeekTemperature;

public class SiriTest1 extends Function {

	public static void main(String[] args) {
		

		// StringArray a = new StringArray();
		// a.string();
		System.out.println("Enter the selection:");
		Scanner input = new Scanner(System.in);
		int mess = input.nextInt();

		switch (mess) {

		case 1:
			InteractiveMessage m1 = new InteractiveMessage();
			m1.sent();
			
			break;
		case 2:
			addition(5, 4);
			massaddition(66, 67, 68, 69);
			break;
		case 3:
			NextWeekTemperature weather = new NextWeekTemperature();
			NextWeekTemperature.weather();
			break;
		case 4:
			SumSwapDigitNumber s1 = new SumSwapDigitNumber();
			s1.digitNumber();
			break;
		case 5:
			WebPage w = new WebPage();
			try {
				w.web();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		default:
			System.out.println("I can not predict your selection:");

		}

	}

}

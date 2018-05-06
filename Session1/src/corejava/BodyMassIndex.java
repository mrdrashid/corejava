package corejava;

public class BodyMassIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int bmi = 10;
		
		//String bodymassindex = "bodymass";
		//int bodymass;

		
		switch (bmi){
		case 10:
			System.out.println("Your Body Mass Index is very low");
			break;
		case 20:
			System.out.println("Your body mass index is very close to line");
			break;
		case 30:
			System.out.println("Your body mass index is somewhat high");
			break;
		case 40:
			System.out.println("Your body mass index is high");
			break;
		case 50:
			System.out.println("Your body mass index is not good");
			break;
		case 60:
			System.out.println("Based on BMI, need to see your doctor");
			break;
		default:
			System.out.println("We cannot predict your BMI");
			break;
			
		//	if (bmi < 20 ) {
			//	System.out.println("You are underweight");
			//}else if (bmi > 30 ){
			//System.out.println(" X is equal to y ");
			//}else {
			//	System.out.println(" X is grater than Y");
			}
		

	}

}


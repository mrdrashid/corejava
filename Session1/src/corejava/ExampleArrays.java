package corejava;

public class ExampleArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10, 20, 30, 40, 50};
		System.out.println(a[2] +" " +a[4]);
		// enhanced for
		for (int temp : a) {
			System.out.println(temp);
		}
			
			System.out.println("------------");
		int[] x = new int[9];
		x[0] = 25;
		x[1] = 15;
		x[2] = 20;
		x[5] = 12;
		x[8] = 30;
		for (int temp1 : x) {
		System.out.println(x[0]+ " "+x[5]+ " "+x[8]);
		//System.out.println(x[0]);
		//System.out.println(temp1);	
		}
		String[] st = {"one", "Two",  "Three"};
		for (String temp2: st){
			System.out.println(temp2);
		}
			
	}	
			
}




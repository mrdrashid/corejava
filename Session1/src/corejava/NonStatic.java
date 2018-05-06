package corejava;

public class NonStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	NonStatic x =new NonStatic();  //instance of an object
	
	x.car();
	x.flower();

	}
	
public void car(){  // non static funtion
	
	System.out.println("Toyota");
	
}

public void flower(){
	
	System.out.println("I like rose");
}

}

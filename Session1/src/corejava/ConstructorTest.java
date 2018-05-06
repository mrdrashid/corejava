package corejava;

public class ConstructorTest {

public static void main(String[] args) {
	
ConstructorDemo person =new ConstructorDemo("Mohammed Rashid", "Male", 55, 484806055);
ConstructorDemo person1 =new ConstructorDemo("Rehana Ahmed", "Female", 50, 135208781);
ConstructorDemo person3=new ConstructorDemo("Sirajam Munira", 21348);
person.DisplayInformation();
person1.DisplayInformation();
person3.DisplayInformation();

}

}

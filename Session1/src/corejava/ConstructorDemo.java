package corejava;

public class ConstructorDemo {
	
	String name, gender;
	int phone, age, StudentID;

ConstructorDemo() {
	
	System.out.println("No Information)");
}
ConstructorDemo(String n, int id) {
	name = n;
	StudentID=id;
}

  ConstructorDemo(String n, String g, int a, int  p){
       name = n;
       gender =g ;
        age = a;
        phone = p;
	
        this.name = n;
        this.phone=p;
        this.age=a;
        this.gender=g;
	
  }

void DisplayInformation() {
	

	System.out.println("Name:  " +name);
	System.out.println("Gender: " +gender);
	System.out.println("Age: " +age);
	System.out.println("Phone: " +phone);
	System.out.println("Student Id: " +StudentID);
	System.out.println("\n\n");
	
}
}

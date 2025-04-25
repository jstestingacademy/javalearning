package oops;

public class Student {

	//properties
	String name;
	int age;
	
	//methods(behaviour)
	void displayinfo() {
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		
  Student s1= new Student();
  s1.name="joshi";
  s1.age=42;
  
  
  s1.displayinfo();
	}

}

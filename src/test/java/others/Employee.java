package others;

public class Employee {

	String name;
	int age;
	
	Employee(){
		this("joshi",40);
	}
	
	Employee(String name, int age) {
	this.name=name;
	this.age=age;
	}
	
	void display() {
		System.out.println(name + " - " + age);
	}
	public static void main(String[] args) {
		Employee e =new Employee();
e.display();
	}

}

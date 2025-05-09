package others;

public class Student1 {

	static String college="Sona college of technology";
	String name;
	
	Student1(String name){
		this.name=name;
	}
	
	void display() {
		System.out.println( name + " - " + college);
	}
	
	public static void main(String[] args) {
		Student1 s  = new Student1("joshi");
		s.display();
	}

}

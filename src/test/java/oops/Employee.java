package oops;

public class Employee {

	//encapsulation example
	
	private String name;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setName("joshi");
		System.out.println(e1.getName());
	}

}

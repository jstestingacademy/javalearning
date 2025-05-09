package training;

public class Car1 {
 String model;
 int year;
 // paramerized constructor
 Car1(String model, int year)
 {
	 this.model =model;
	 this.year= year;
 }
 
 public void display() {
	 System.out.println(model + "" + year);
 }
	
	public static void main(String[] args) {
		Car1 c1= new Car1(" toyota",2025);
		c1.display();

	}

}

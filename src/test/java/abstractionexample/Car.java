package abstractionexample;

public class Car extends vechicle{

	
	
	
    void start() {
        System.out.println("Car is starting...");
    }
	

	public static void main(String[] args) {
		
		Car C= new Car();
		C.start();
	}


}

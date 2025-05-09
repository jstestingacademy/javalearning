package interfaceexample;

public class bird  implements flyable{

	public static void main(String[] args) {
		
		bird b =new bird();
		b.fly();
	}

	public void fly() {
		System.out.println("bird flyies");
		
	}

}

package abstractionexample;

public class Logintest extends Basetest{

	public static void main(String[] args) {
		Logintest test =new Logintest();
		test.runtest();
		test.setup();
		test.teardown();

	}

	@Override
	void runtest() {
		driver.get("https://www.facebook.com/")	;	
	}

}

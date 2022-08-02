package abstraction;

public class KidMain {

	public static void main(String[] args) {
		
		//BigKid b1 = new BigKid();
		Kid k1 = new BigKid();
		k1.readBook();
		
		//TeenAger a1 = new TeenAger();
		Kid k2 = new TeenAger();
		k2.readBook();

	}

}

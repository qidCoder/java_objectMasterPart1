package objectMaster1;
//Test these methods work using a HumanTest class

public class HumanTest {

	public static void main(String[] args) {
		//instantiate a human
		Human jerry = new Human();
		Human george = new Human();
		
		jerry.getHealth();
		george.getHealth();
		
		jerry.attack(george);
		
		jerry.getHealth();
		george.getHealth();
	}

}

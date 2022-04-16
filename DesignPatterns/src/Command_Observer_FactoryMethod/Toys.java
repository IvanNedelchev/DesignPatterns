package Command_Observer_FactoryMethod;

public class Toys {

	private boolean toyType;
	
	public void Dolls() {
		System.out.println("Need dolls");
		this.toyType = true;
	}
	
	public void Bicycles() {
		System.out.println("Need bicycles");
		this.toyType = false;
	}
}
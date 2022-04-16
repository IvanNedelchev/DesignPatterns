package Command_Observer_FactoryMethod;


public class DollFactory extends ToyFactory {

	@Override
	public ToyProduct createProduct(String toyName) {
		if(toyName == "DOLL") {
			return new Doll();
		}
		
		System.out.println("Unknown toy");
		return null;
	}

}

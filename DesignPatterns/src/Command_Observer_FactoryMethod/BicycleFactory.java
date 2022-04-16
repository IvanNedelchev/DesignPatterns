package Command_Observer_FactoryMethod;


public class BicycleFactory extends ToyFactory {

	@Override
	public ToyProduct createProduct(String toyName) {
		if(toyName == "BICYCLE") {
			return new Bicycle();
		}
		
		System.out.println("Unknown toy");
		return null;
	}

}
package Command_Observer_FactoryMethod;


public abstract class ToyFactory {

	public abstract ToyProduct createProduct(String toyName);
	
	public ToyProduct produceProduct(String toyName) {
		ToyProduct product = createProduct(toyName);
		product.prepare();
		return product;
	}
}

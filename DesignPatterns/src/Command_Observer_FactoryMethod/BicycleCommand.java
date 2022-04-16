package Command_Observer_FactoryMethod;


public class BicycleCommand implements Command {

	private Toys toys;
	
	public BicycleCommand(Toys toys) {
		this.toys = toys;
	}
	
	@Override
	public void execute() {
		this.toys.Bicycles();

	}

}
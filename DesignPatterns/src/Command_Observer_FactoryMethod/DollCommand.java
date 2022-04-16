package Command_Observer_FactoryMethod;


public class DollCommand implements Command {

	private Toys toys;
	
	public DollCommand(Toys toys) {
		this.toys = toys;
	}
	
	@Override
	public void execute() {
		this.toys.Dolls();

	}

}
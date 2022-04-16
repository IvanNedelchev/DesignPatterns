package Command_Observer_FactoryMethod;


public class Command_Observer_FactoryMethodMain {

	public static void main(String[] args) {
		MagicBoard task = new MagicBoard();
		Observer dw1 = new Dwarf("Dwarf 1");
		Observer dw2 = new Dwarf("Dwarf 2");
		Observer dw3 = new Dwarf("Dwarf 3");

		task.attach(dw1);
		task.attach(dw2);
		task.attach(dw3);
		task.setTask("Need dolls");

		
		
		
		
		
		Toys toys = new Toys();
		Command dollCommand = new DollCommand(toys);
		Command bicycleCommand = new BicycleCommand(toys);
		
		MagicBoard remote = new MagicBoard();
		remote.setCommand(bicycleCommand);
		remote.sayWords();
		
		remote.setCommand(dollCommand);
		remote.sayWords();
		
		
		
		
		ToyFactory dollFactory = new DollFactory();
		ToyProduct doll = dollFactory.produceProduct("DOLL");
		
		ToyFactory bicycleFactory = new BicycleFactory();
		ToyProduct bicycle = bicycleFactory.produceProduct("BICYCLE");
		
		
	}

}

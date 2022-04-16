package Command_Observer_FactoryMethod;

public class Dwarf implements Observer {

	private String name;
	private Observable task;
	
	public Dwarf(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.task == null) {
			System.out.println("No task set.");
			return;
		}
		String lastTask =  this.task.getUpdate();
        System.out.println(this.name + " Last task: " + lastTask);

	}

	@Override
	public void setTask(Observable task) {
		this.task = task;

	}

}

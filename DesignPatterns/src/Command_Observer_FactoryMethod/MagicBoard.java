package Command_Observer_FactoryMethod;

import java.util.ArrayList;
import java.util.List;


public class MagicBoard implements Observable {

	
	private List<Observer> observers;
	private String task;
	
	public MagicBoard() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void attach(Observer observer) {
		this.observers.add(observer);
        observer.setTask(this);
	}

	@Override
	public void detach(Observer observer) {
		this.observers.remove(observer);
		observer.setTask(null);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer: this.observers) {
			observer.update();
		}

	}

	@Override
	public String getUpdate() {
		// TODO Auto-generated method stub
		return this.task;
	}

	public void setTask(String task) {
		this.task = task;
		this.notifyObservers();
	}
	
	
	
	private Command command;
	
	public Command getCommand() {
		return command;
	}
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void sayWords() {
		if (this.command == null) {
			System.out.println("No command set");
			return;
		}
		this.command.execute();
	}
}

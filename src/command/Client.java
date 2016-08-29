package command;

public class Client {
	public static void main(String[] args) {
		Television tv = new Television();
		Command off= new CloseCommand(tv);
		Command open = new OpenCommand(tv);
		Command changeChannel = new ChangeChannel(tv);
		Controller controller = new Controller(open, off, changeChannel);
		controller.turnOn();
		controller.changeChannel();
		controller.turnOff();
		
	}
}

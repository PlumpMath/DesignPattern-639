package command;

public class Controller {
	private Command openCommand;
	private Command offCommand;
	private Command changeChannelCommand;
	public Controller(Command open, Command off, Command changeChannel){
		this.offCommand = off;
		this.openCommand = open;
		this.changeChannelCommand = changeChannel;
	}
	public void turnOn(){
		openCommand.execute();
	}
	public void turnOff(){
		offCommand.execute();
		
	}
	public void changeChannel(){
		changeChannelCommand.execute();
	}

}

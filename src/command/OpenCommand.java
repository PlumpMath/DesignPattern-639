package command;

public class OpenCommand implements Command{

	private Television tv;
	public OpenCommand(Television tv){
		this.tv = tv;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.on();
	}

}

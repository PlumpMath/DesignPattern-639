package command;

public class ChangeChannel implements Command{

	private Television tv;
	public ChangeChannel(Television tv){
		this.tv = tv;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.changechannel();
	}

}

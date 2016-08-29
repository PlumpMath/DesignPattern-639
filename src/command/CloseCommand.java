package command;

public class CloseCommand implements Command{

	private Television tv;
	public CloseCommand(Television tv){
		this.tv = tv;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.off();
	}

}

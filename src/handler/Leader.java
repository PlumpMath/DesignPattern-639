package handler;

public abstract class Leader {
	protected String name;
	protected Leader successor;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Leader getSuccessor() {
		return successor;
	}
	public void setSuccessor(Leader successor) {
		this.successor = successor;
	}
	public Leader(String name){
		this.name = name;
	}
	public abstract void handle(LeaveNode leaveNode);
}

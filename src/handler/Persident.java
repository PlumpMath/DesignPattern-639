package handler;

public class Persident extends Leader{

	public Persident(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handle(LeaveNode leaveNode) {
		// TODO Auto-generated method stub
		if(leaveNode.getNum() <=15){
			System.out.println("Persident "+name+" permitt "+leaveNode.getPerson()+" leave "+leaveNode.getNum());
		}else {
			if(successor!=null){
				successor.handle(leaveNode);
			}
		}
	}

}

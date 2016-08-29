package handler;

public class Dean extends Leader{

	public Dean(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handle(LeaveNode leaveNode) {
		// TODO Auto-generated method stub
		if(leaveNode.getNum() <=10){
			System.out.println("Dean "+name+" permitt "+leaveNode.getPerson()+" leave "+leaveNode.getNum());
		}else {
			if(successor!=null){
				successor.handle(leaveNode);
			}
		}
	}

}

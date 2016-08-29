package handler;

public class Instructor extends Leader{

	public Instructor(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handle(LeaveNode leaveNode) {
		// TODO Auto-generated method stub
		if(leaveNode.getNum() <=3){
			System.out.println("instructor "+name+" permitt "+leaveNode.getPerson()+" leave "+leaveNode.getNum());
		}else {
			if(successor!=null){
				successor.handle(leaveNode);
			}
		}
	}

}

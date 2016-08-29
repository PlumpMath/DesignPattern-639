package handler;

public class DepartmentHeader extends Leader{

	public DepartmentHeader(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handle(LeaveNode leaveNode) {
		// TODO Auto-generated method stub
		if(leaveNode.getNum() <=5){
			System.out.println("DepartmentHeader "+name+" permitt "+leaveNode.getPerson()+" leave "+leaveNode.getNum());
		}else {
			if(successor!=null){
				successor.handle(leaveNode);
			}
		}
	}

}

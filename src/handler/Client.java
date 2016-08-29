package handler;

public class Client {
	public static void main(String[] args) {
		LeaveNode leaveNode = new LeaveNode("dgh", 12);
		Leader instructor = new Instructor("zhangsan");
		Leader departmentLeader = new DepartmentHeader("lisi");
		Leader dean = new Dean("huangwu");
		Leader persident = new Persident("liuliu");
		instructor.setSuccessor(departmentLeader);
		departmentLeader.setSuccessor(dean);
		dean.setSuccessor(persident);
		
		instructor.handle(leaveNode);
	}
}

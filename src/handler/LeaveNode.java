package handler;

public class LeaveNode {
	private String person;
	private int num;
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public LeaveNode (String person, int num){
		this.person = person;
		this.num = num;
	}
}

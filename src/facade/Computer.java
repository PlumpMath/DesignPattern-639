package facade;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Computer {
	private Cpu cpu;
	private Disk disk;
	public Computer(){
		cpu = new Cpu();
		disk = new Disk();
	}
	public void startUp(){
		cpu.startUp();
		disk.startUp();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer = new Computer();
		computer.startUp();
		
	}
	

}

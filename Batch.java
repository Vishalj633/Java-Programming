package package2;

import java.util.Scanner;
public class Batch {
	public int batch_no;
	public int year;
	private String name;
	private int size;
	
	public Batch(){
		this.name=name;
		this.batch_no=batch_no;
		this.year=year;
		this.size=size;
	}
	
	public void accept() {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Batch name: ");
		name=ip.next();
		System.out.println("Enter Batch no.: ");
		batch_no=ip.nextInt();
		System.out.println("Enter Batch size.: ");
		size=ip.nextInt();
		System.out.println("Enter Batch year: ");
		year=ip.nextInt();
		ip.close();
	}
	
	
	public void display() {
		System.out.println("Batch Name:"+name);
		System.out.println("Batch no.:"+batch_no);
		System.out.println("Batch size:"+size);
		System.out.println("Year : "+year);
		
	}

}
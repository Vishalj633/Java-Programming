package package1;

import java.util.Scanner;
public class Student {
	public int roll_no;
	public String name;
	private String grade;
	int totalmarks;
	
	public Student(){
		this.name=name;
		this.roll_no=roll_no;
		this.totalmarks=totalmarks;
	}
	
	public void accept() {    // default access modifier
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter name: ");
		name=ip.next();
		System.out.println("Enter roll no.: ");
		roll_no=ip.nextInt();
		System.out.println("Enter totalmarks out of 100: ");
		totalmarks=ip.nextInt();
		ip.close();
	}
	
	
	private String gradecal(int totalmarks) {
		this.totalmarks=totalmarks;
		
		if(totalmarks>=75)
			this.grade="A";
		else if(totalmarks>=60)
			this.grade="B";
		else
			this.grade="C";
		return grade;
		
	}
	
	
	public void display() {   // default access modifier
		System.out.println("Name:"+name);
		System.out.println("Roll no.:"+roll_no);
		System.out.println("Total marks out of 100:"+totalmarks);
		System.out.println("Grade: "+gradecal(this.totalmarks));
		
	}

}

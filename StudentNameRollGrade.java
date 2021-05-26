import java.util.Scanner;
public class StudentNameRollGrade {
	public static void main(String[] args) {
		
		int rollno, sub1, sub2, sub3, sub4, sub5, total;
		double perct;
		String name;
		
		System.out.println("Enter Your name:");
		Scanner input=new Scanner(System.in);
		name=input.nextLine();
		
		System.out.println("Enter your roll no.:");
		rollno=input.nextInt();
		
		System.out.println("Enter your 5 subject's marks.");
		System.out.println("Subject 1:");
		sub1=input.nextInt();
		System.out.println("Subject 2:");
		sub2=input.nextInt();
		System.out.println("Subject 3:");
		sub3=input.nextInt();
		System.out.println("Subject 4:");
		sub4=input.nextInt();
		System.out.println("Subject 5:");
		sub5=input.nextInt();
		
		input.close();
		
		total=(sub1+sub2+sub3+sub4+sub5);
		perct=total/500.0*100.0;
		
		System.out.println("Name: "+name);
		System.out.println("Roll No.: "+rollno);
		System.out.println("Total Marks: "+total);
		System.out.println("Percentage: "+perct);
		
		if(perct>75)
			System.out.println("Grade A");
		else if(perct>60)
			System.out.println("Grade B");
		else
			System.out.println("Grade C");
		
	}
}

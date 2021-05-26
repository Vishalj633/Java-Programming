import java.util.Scanner;
public class GreatestNo {
	public static void main(String[] args) {
		int n1, n2, n3;
		
		System.out.println("Enter Three Numbers: ");
		Scanner ip=new Scanner(System.in);
		n1=ip.nextInt();
		n2=ip.nextInt();
		n3=ip.nextInt();
		ip.close();
		
		if(n1>n2) {
			if(n1>n3)
				System.out.println(n1+" is the greatest of all numbers.");
			else
				System.out.println(n3+" is the greatest of all numbers.");
		}
		else {
			if(n2>n3)
				System.out.println(n2+" is the greatest of all numbers.");
			else
				System.out.println(n3+" is the greatest of all numbers.");
		}
		
	}
}

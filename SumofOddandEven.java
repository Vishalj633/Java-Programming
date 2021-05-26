
import java.util.Scanner;

public class SumofOddandEven {
	public static void main(String[] args) {
		
		int num, sume=0, sumo=0, a;
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		sc.close();
		
		for(a=1;a<=num;a++) {
			if(a%2==0) {
				sume=sume+a;
			}
			else {
				sumo=sumo+a;
			}
		}
		System.out.println("Sum of even numbers is "+sume);
		System.out.println("Sum of odd numbers is "+sumo);
	}
}

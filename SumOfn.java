
import java.util.Scanner;
public class SumOfn {
	public static void main(String[] args) {
		
		int num,temp, a, sum=0;
		System.out.println("Enter a number:");
		Scanner no=new Scanner(System.in);
		num=no.nextInt();
		no.close();
		
		temp=num;
		
		for(a=num;a>0;a--)
			sum=sum+a;
		System.out.println("Sum of all numbers from 1 to "+temp+" is "+sum);
		
	}

}

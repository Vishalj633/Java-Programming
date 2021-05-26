
import java.util.Scanner;
public class PalindromeNo {
	public static void main(String[] args) {
		
		int num, rem, sum=0, temp;
		System.out.print("Enter your number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		sc.close();
		
		temp=num;
		
		while(num>0) {
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(temp==sum)
			System.out.println("The number is a Palindrome number");
		else
			System.out.println("The number is not a Palindrome number");
			
	}
}

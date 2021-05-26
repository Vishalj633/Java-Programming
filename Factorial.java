
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		int num, temp, mul=1;
		
		System.out.print("Enter a Number:");
		Scanner no=new Scanner(System.in);
		num=no.nextInt();
		no.close();
		
		temp=num;
		
		while(num!=0) {
			mul=mul*num;
			num--;
		}
		System.out.println("The Factorial of "+temp+" is "+mul);
	}

}

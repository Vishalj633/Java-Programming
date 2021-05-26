
import java.util.Scanner;
public class ReverseNO {
	public static void main(String[] args) {
		
		int num, temp, sum=0, rem;
		System.out.print("Enter a Number");
		Scanner no=new Scanner(System.in);
		num=no.nextInt();
		no.close();
		
		temp=num;
		
		while(num>0) {
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		System.out.println("The reverse number of "+temp+" is " +sum);
		
	}
	

}

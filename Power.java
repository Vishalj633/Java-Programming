
import java.util.Scanner;

public class Power {
	
	public static void main(String[] args){
		
		int no, pr, a, result=1;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a Number:");
			no=sc.nextInt();
			System.out.print("Enter power:");
			pr=sc.nextInt();
		}
		
		if(pr==0)
		{
			System.out.println("If the power of any number is 0 answer is 1 always");
		}
		else 
		{
			for(a=1;a<=pr;a++)
			{
				result=result*no;
			}
			
			System.out.println(no+" to the power "+pr+" is "+result);
		}
	}

}

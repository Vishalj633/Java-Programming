
import java.util.Scanner;
public class Compound_int {
	
	public static void main(String[] args) 
	{
		double ci=0, i, p, ti, a, b=0;
		
		   Scanner sc = new Scanner(System.in);
			System.out.println("Enter Principal Amount :");
			p=sc.nextInt();
			System.out.println("Enter interest rate:");
			i=sc.nextInt();
			System.out.println("Enter time in years");
			ti=sc.nextInt();
			sc.close();
			
		
		
		b=p;
		for(a=1;a<=ti;a++)
		{
			ci=(p*i*1)/100;
			p=p+ci;
			
		}
		
		b=p-b;
		
		System.out.println("Compundy amount is:"+p);
		System.out.println("Compund interest is:"+b);
	
	}

}
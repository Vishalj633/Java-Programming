
import java.util.Scanner;
public class PrimeNO {
	public static void main(String[] args) {
		
		int num, i, count=0;
		System.out.print("Enter a Number:");
		Scanner no=new Scanner(System.in);
		num=no.nextInt();
		no.close();
		
		if (num==1)
			System.out.println("1 is neither a prime nor a composite number.");
		else if(num==2)
			System.out.println("2 is only prime number which is also an even number.");
		else {
			for(i=2;i<num;i++) {
				if(num%i==0)
					count++;
			}
			if(count==0)
				System.out.println(num+" is a prime number.");
			else
				System.out.println(num+" is not a prime number.");
		}
	}

}

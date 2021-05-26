import java.util.Scanner;
public class ArmstrongNO {
	public static void main(String [] args) {
		
		int num, count=0, result=0, mul=1, cnt, rem, temp;
		
		System.out.print("Enter a Number");
		Scanner ip=new Scanner(System.in);
		num=ip.nextInt();
		ip.close();
		
		temp=num;
		
		while(temp!=0) {
			temp=temp/10;
			count++;
		}
		
		cnt=count;
		temp=num;
		
		while(temp!=0) {
			rem=temp%10;
			while(cnt!=0) {
				mul=mul*rem;
				cnt--;
			}
			result=result+mul;
			cnt=count;
			temp=temp/10;
			mul=1;
		}
		
		if(result==num) 
			System.out.println(num+" is an Armstrong Number");
		else
			System.out.println(num+" is not an Armstrong Number");
	}
}

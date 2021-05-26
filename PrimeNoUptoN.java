
import java.util.Scanner;
public class PrimeNoUptoN {
	public static void main(String[] args) {
		
		int num, i, j, count;
		System.out.print("Enter a Number:");
		Scanner ip=new Scanner(System.in);
		num=ip.nextInt();
		
		for(i=2;i<=num;i++) {
			count=0;
		    for(j=2;j<i;j++){
			    if(i%j==0) {
				count++;
			}		
		}
		    if(count==0) {
				System.out.print(i+" ");
			}
	 }
   }
}

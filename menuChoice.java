import java.util.Scanner;

public class menuChoice {
	public static void main(String[] arg) {
		int q, c, t1, t2, t3, t4, t5, t, choice;
		boolean flag=false;
		Scanner input=new Scanner(System.in);
		System.out.println("1: Pen");
		System.out.println("2: Pencil");
		System.out.println("3: Notebook");
		System.out.println("4: Bottle");
		System.out.println("5: Colorbox");
		System.out.println("6: Exit");
		
		t=t1=t2=t3=t4=t5=0;
		
		while(flag!=true) {
			System.out.print("Enter your choice:");
			choice=input.nextInt();
			
			switch(choice) {
			
			case 1: System.out.print("Enter quantity:");
			        q=input.nextInt();
			        c=10;
			        t1=q*c;
			        break;
			
            case 2: System.out.print("Enter quantity:");
            		q=input.nextInt();
            		c=5;
            		t2=q*c;
			        break;
			
            case 3: System.out.print("Enter quantity:");
            		q=input.nextInt();
    				c=20;
    				t3=q*c;
                    break;
            
            case 4: System.out.print("Enter quantity:");
            		q=input.nextInt();
            		c=30;
            		t4=q*c;
                    break;
            
            case 5: System.out.print("Enter quantity:");
            		q=input.nextInt();
            		c=50;
            		t5=q*c;
                    break;
            case 6: flag=true;
                    break;
       
			}
			
		}
		input.close();
		t=t1+t2+t3+t4+t5;
		System.out.print("Total amount of all purchased items is Rs."+t);
	}
}

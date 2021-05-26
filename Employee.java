import java.util.Scanner;

public class Employee {
	private int id;
	private String name;
	private double bs_sal;
	private double hra;
	private double medl=500;
	private double pf;
	private double pt=200;
	private double net_sal;
	private double gs_sal;
	
	
	Employee(){
		this.id=id;
		this.name=name;
		this.bs_sal=bs_sal;
	}
	public void acceptinfo(){
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter name:");
		name=ip.next();
		System.out.println("Enter id:");
		id=ip.nextInt();
		System.out.println("Enter Basic salary:");
		bs_sal=ip.nextDouble();
		ip.close();
	}
	
	private double gsSal(double bs_sal) {
		this.bs_sal=bs_sal;
		this.hra=50.0*bs_sal/100.0;
		this.gs_sal=this.bs_sal+this.hra+this.medl;
		return this.gs_sal;
		
	}
	
	private double netSal(double bs_sal) {
		this.bs_sal=bs_sal;
		this.pf=12.0*bs_sal/100.0;
		this.net_sal=this.gs_sal-(this.pt+this.pf);
		return this.net_sal;
	}
	
	public void displyDetails() {
		gsSal(bs_sal);
		netSal(bs_sal);
		
		System.out.println("Emp_id: "+id);
		System.out.println("Emp_name: "+name);
		System.out.println("Emp_Gross salary: "+gs_sal);
		System.out.println("Emp_Net salary: "+net_sal);
	}
	

} 

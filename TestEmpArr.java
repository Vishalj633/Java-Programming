package package1;

public class TestEmpArr {
	public static void main(String[]args) {
		
		Employee[] allemp=new Employee[5];
		
		Employee emp1= new Employee(1, "Vishal", "Satara", 15000);
		Employee emp2= new Employee(2, "Saurabh", "Ratnagiri", 19000);
		Employee emp3= new Employee(3, "Yogesh", "Mumbai", 25000);
		Employee emp4= new Employee(4, "Niti", "Pune", 25000);
		Employee emp5= new Employee(5, "Mati", "Nagpur", 25000);
		
		allemp[0]=emp1;
		allemp[1]=emp2;
		allemp[2]=emp3;
		allemp[3]=emp4;
		allemp[4]=emp5;
		
		System.out.println("With for loop");
		System.out.println("________________");
		for(int i=0;i<allemp.length;i++) {
			allemp[i].displayInfo();
			System.out.println("________________");
		}
		
		
		/*System.out.println("With for each loop");
		System.out.println("________________");
		for(Employee emp: allemp) {
			emp.displayInfo();
			System.out.println("________________");
		}*/
	}

}

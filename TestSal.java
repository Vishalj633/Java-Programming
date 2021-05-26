package package1;

public class TestSal {
	public static void main(String[]args) {
		
		
	    Employee[] allemp=new Employee[5];
		
		Employee emp1= new Employee(1, "Vishal", "Satara", 15000);
		Employee emp2= new Employee(2, "Saurabh", "Ratnagiri", 19000);
		Employee emp3= new Employee(3, "Yogesh", "Mumbai", 46000);
		Employee emp4= new Employee(4, "Niti", "Pune", 25000);
		Employee emp5= new Employee(5, "Mati", "Nagpur", 35000);
		
		allemp[0]=emp1;
		allemp[1]=emp2;
		allemp[2]=emp3;
		allemp[3]=emp4;
		allemp[4]=emp5;
		
		System.out.println("Employee details whose salary is >20000: ");
		System.out.println("____________________________");
		for(int i=0;i<allemp.length;i++) {
			allemp[i].salSort();
		}
	}

}

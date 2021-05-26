
public class AddOf2Darr {
	public static void main(String[]args) {
		
		int i, j;
		
		int [][] arr1= {{10,15,20},{25,30,35}};
		int [][] arr2= {{23,28,38},{36,34,44}};
		int [][] arr3=new int[2][3];
		
		System.out.println("Third array after adding two arrays is");
		for(i=0;i<2;i++) {
			for(j=0;j<3;j++) {
				arr3[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(arr3[i][j]+" ");
			}
		System.out.println();
		}
			
	}

}

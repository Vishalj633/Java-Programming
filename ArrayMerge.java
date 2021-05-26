
public class ArrayMerge {
	public static void main(String[] args) {
		
		int i;
		int[] arr1= {3,43,5};
		int[] arr2= {14,55,82,98};
		
		System.out.println("Elements of first array");
		
	    for(i=0;i<arr1.length;i++) {
			
			System.out.print(arr1[i]+" ");
		}
	    
	    System.out.println();
		System.out.println("Elements of second array");
	    for(i=0;i<arr2.length;i++) {
			
				System.out.print(arr2[i]+" ");
			}
	    
	    System.out.println();
	    System.out.println("Elements of array after merging");
	    
	    
		int []arr3=new int[arr1.length+arr2.length];
		
		for(i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		
		for(i=0;i<arr2.length;i++) {
			arr3[arr1.length+i]=arr2[i];
		}
		
		for(i=0;i<arr3.length;i++) {
			
			System.out.print(arr3[i]+" ");
		}
		
		
	}

}

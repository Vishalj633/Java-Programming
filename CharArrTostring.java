
public class CharArrTostring {
		   public static void main(String []args) {
			   int i;
		      char[] arr = { 'V', 'i', 's', 'h', 'a', 'l' };
		      System.out.println("Elements of character array are:");
		      for(i=0;i<arr.length;i++) {
		    	  System.out.print(arr[i]+" ");
		      }
		      System.out.println();
		      System.out.println("After coversion:");
		      String str = String.valueOf(arr);
		      System.out.println(str);
		   }
}

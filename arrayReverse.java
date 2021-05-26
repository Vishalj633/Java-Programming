
public class arrayReverse {
		public static void main(String[] arg) {
			int i;
			int [] numarr= {22, 16, 18, 21, 25, 62};

			System.out.print("Elements of array are:");
			for (i=0;i<numarr.length;i++)
			   System.out.print(" "+numarr[i]);
			
			System.out.println("");
			
			System.out.print("Reverse array elements are:");
			for (i=numarr.length-1;i>=0;i--)
				System.out.print(" "+numarr[i]);	
		}
}


public class TwoDarr {
	public static void main(String[] args) {
		int i, j;
		int [][] arrtd=new int [2][2];
		arrtd [0][0]=15;
		arrtd [0][1]=21;
		arrtd [1][0]=16;
		arrtd [1][1]=48;
		
		System.out.println("2D Array of Elements is:");
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				System.out.print(arrtd[i][j]+" ");
			}
	
			System.out.println();
		}
		
	}

}

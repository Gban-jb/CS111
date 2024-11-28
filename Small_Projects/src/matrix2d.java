
public class matrix2d {

	public static void main(String[] args) {
		int [][] matrix = new int [10][10];
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random()* 10);
				System.out.printf("%-4d", matrix[i][j]);
			}
			System.out.println();	
			}
		
		
		int maxrow = 0;		
		for(int i = 0; i <matrix[0].length; i++) {
			maxrow += matrix[0][i];
		}
		System.out.println(maxrow);
		int rowtotalmaxIndex = 1;
		for(int i = 1; i < matrix.length; i++) {
			int rowtotalmax = 0;
			
			for(int j =0; j < matrix[i].length; j++) {
				rowtotalmax += matrix[i][j];
				if(rowtotalmax > maxrow ) {
					maxrow = rowtotalmax;
					rowtotalmaxIndex = i;
				}	
			}
			System.out.println(rowtotalmax);
		}
		System.out.printf("%d The total max sum is %d", rowtotalmaxIndex +1,maxrow);	
	}
}
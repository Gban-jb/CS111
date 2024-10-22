public class NumberPattern {
    public static void main(String[] args) {
   
   for(int i = 1; i <=5; i++){ // Stars and row connections
	   
       for(int j = 4; j>=i; j--){ // Determines - |
    	   
           System.out.print("|");
       }
       
       for (int k = 1; k <= 2* i -1; k++){ // Printing the * with the linkage of i loops. 
    	   
          System.out.print("*");  
       }
       
       for(int l = 4; l>=i; l--){   //  For printing | after the * 
    	   
           System.out.print("|");
       }
       
       System.out.println();  // Line break
       
   } // first i loop end
   
   for (int i = 4; i >= 1; i-- ) {
	   for (int j = 1; j <= 5 - i; j++ ) {
		   System.out.print("|");	// first |   
	   }
	   for(int k = 1; k <= 2* i -1; k ++) {
		   System.out.print("*");   // star print
	   }
	   
	   for(int l = 1; l <= 5-i; l++){   //  For printing | after the * 
    	   
           System.out.print("|");
       }
       System.out.println( );
   }
   
     
}
}


public class TurtleCrossing {

	public static void main(String[] args) {
		
		// final constants
		final int LENGTH = 10;
		final int WIDTH = 3;
		
		int position = WIDTH / 2;
		// for loop
		for(int i = 0; i <= LENGTH; i++) {
			int num = (int) (Math.random()*3);
			//System.out.println(num);
			num--; //to count the number between -1, 0 and 1.
			
			position += num; // to find out the position of the turtle
			//System.out.println(position);
			if(position >= WIDTH ||position < 0) {
				// for position less than 0- for the left log
				if(position < 0) {
					System.out.print("T|");
					for(int j =0; j < WIDTH; j++) {
						System.out.print(" ");
					}
					System.out.print("|\n");
					
					}
				
				else {
					System.out.print("|");
					for(int j = 0; j < WIDTH; j++) {
						System.out.print(" ");
					}
					System.out.print("|T \n");	
				}
				i = LENGTH + 1;

			}
		System.out.println(" The Turtle has to swim.");

		}

	}

}

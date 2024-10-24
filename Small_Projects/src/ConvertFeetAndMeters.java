// Jeeban Bashyal

public class ConvertFeetAndMeters {

	public static void main(String[] args) {

		System.out.printf("%-20s %-10s | %-20s %-10s\n", "Feet", "Meters", "Meters", "Feet");
		for( int i = 0; i < 35; i ++) {
			System.out.print("_ ");	
		}
		System.out.println(); // Line break after the st. line
		
		for ( double i = 0.0; i < 10.0; i++) {   // Running the loop
			
			double feet = 1.0 + i;				// Changing the feet from 1.0 to 10.0 - Running the loop for the 10 times
			double loopMeter = 20.0 + 5.0 * i;	// Changing the meter from 20.0 to 65.0 - Running the loop for the 10 times
			double meters = footToMeter(feet);  // Calling the method where meter is converted into feet.
			double secondFeet = meterToFeet(loopMeter);  // Calling the method where feet is converted into meter.
			
			System.out.printf("%-20.1f %-10.3f | %-20s %-10.3f\n", feet, meters, loopMeter, secondFeet);  // Whole print statements according to the needs
		} // For loop closed
		
		}	// main loop closed
	
	public static double footToMeter(double feet) {  // Method one - Converting feet to the meter
			return  0.305 * feet;
		}
	
	public static double meterToFeet(double meter) {  // Method two - Converting meter to the feet
		return  3.279 * meter;
	}
	} // End of the public class

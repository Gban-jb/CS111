
public class switchCase {

	public static void main(String[] args) {

		System.out.println("Enter the day: ");
		
		int day = 3;
		String dayName;
		
		switch (day){
			case 1: 
				dayName = "Sunday";
				break;
				
			case 2:
				dayName = "Monday";
				break;
				
			case 3:
				dayName = "Tuesday";
				break;
				
			default:
				dayName = "Invalid Name";
				
		}
		
		System.out.println(dayName);
	}

}

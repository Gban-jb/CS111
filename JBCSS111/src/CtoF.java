//Jeeban Bashyal

import java.util.Scanner;

public class CtoF {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a degree in Celcius" );
				
				
		int Celsius = sc.nextInt();
		
		double fahrenheit = (9 / 5) * Celsius + 32;
		
		System.out.println(Celsius + " Celsius is " + fahrenheit + " Fahrenheit");
		
	}
}
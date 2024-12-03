
public class TestCircle {
	
	
// Main Method
	public static void main(String[] args) {
		// Create a circle with main method
		// create a circle with radius 1
		Circle circle1 = new Circle();
		System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());
		
		// create a circle with radius 25
		Circle circle2 = new Circle(25);
		System.out.println(" The area od the circle with radius "+ circle2.radius + " is " + circle2.getArea());
		
	// create a circle with radius 125
		Circle circle3 = new Circle(125);
		System.out.println(" The area of the circle with radius " + circle3.radius + " is " + circle3.getArea());
		
		// Create a circle with modified radius
		circle2.radius = 100;
		System.out.println(" The area of the circle with radius" + circle2.radius + " is " + circle2.getArea());	
	}
	}
	
	class Circle {
		double radius;
	// Construct the circle with radius 1
		Circle() {
			radius = 1;
		}
		
		// Construct the circle with specified radius
		Circle(double newRadius){
			radius = newRadius;
		}
		
		// Return the area of the circle
		
		double getArea() {
			return radius*radius*Math.PI;
		}
		
		double getPerimeter() {
			return 2*radius*Math.PI;
		}
		
		// Set a new radius for a new circle
		
		void setRadius(double newRadius) {
			radius = newRadius;
		}
}

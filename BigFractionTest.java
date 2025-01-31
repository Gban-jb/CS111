import java.math.BigInteger;
import java.math.RoundingMode;


public class BigFractionTest {

	public static void main(String[] args) {
		BigFraction f1 = new BigFraction(new BigInteger("4"), new BigInteger("8"));
		System.out.println(f1); // Expected: 1/2
		BigFraction f2 = new BigFraction(new BigInteger("3"), new BigInteger("-9"));
		System.out.println(f2); // Expected: -1/3
		try {
		    BigFraction f3 = new BigFraction(new BigInteger("5"), new BigInteger("0"));
		} catch (IllegalArgumentException e) {
		    System.out.println(e.getMessage()); // Expected: Denominator cannot be zero.
		}
		BigFraction f4 = new BigFraction(3, 9);
		System.out.println(f4); // Expected: 1/3
		BigFraction f5 = new BigFraction(2, -4);
		System.out.println(f5); // Expected: -1/2
		BigFraction f6 = new BigFraction("6/4");
		System.out.println(f6); // Expected: 3/2
		try {
		    BigFraction f7 = new BigFraction("6");
		} catch (IllegalArgumentException e) {
		    System.out.println(e.getMessage()); // Expected: Valid format: numerator/denominator.
		}
		BigFraction f8 = new BigFraction(1, 2);
		BigFraction f9 = new BigFraction(1, 3);
		System.out.println(f8.add(f9)); // Expected: 5/6
		BigFraction f10 = new BigFraction(1, 2);
		BigFraction f11 = new BigFraction(-1, 4);
		System.out.println(f10.add(f11)); // Expected: 1/4
		BigFraction f12 = new BigFraction(3, 4);
		BigFraction f13 = new BigFraction(1, 4);
		System.out.println(f12.subtract(f13)); // Expected: 1/2
		BigFraction f14 = new BigFraction(1, 5);
		BigFraction f15 = new BigFraction(2, 5);
		System.out.println(f14.subtract(f15)); // Expected: -1/5
		BigFraction f18 = new BigFraction(2, 3);
		BigFraction f19 = new BigFraction(-3, 4);
		System.out.println(f18.multiply(f19)); // Expected: -1/2
		try {
		    BigFraction f22 = new BigFraction(1, 2);
		    BigFraction f23 = new BigFraction(0, 1);
		    System.out.println(f22.divide(f23));
		} catch (ArithmeticException e) {
		    System.out.println(e.getMessage()); // Expected: Cannot divide by zero.
		}BigFraction f24 = new BigFraction(3, 4);
		System.out.println(f24.negate()); // Expected: -3/4
		
		BigFraction f26 = new BigFraction(1, 2);
		System.out.println(f26.asBigDecimal(2, RoundingMode.HALF_UP)); // Expected: 0.50
		
		BigFraction f28 = new BigFraction(3, 5);
		System.out.println(f28.getNum()); // Expected: 3
		System.out.println(f28.getDen()); // Expected: 5
		
		BigFraction f29 = new BigFraction(2, 3);
		System.out.println(f29.toString()); // Expected: 2/3
		
	}
}

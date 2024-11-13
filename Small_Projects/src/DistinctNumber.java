import java.util.Scanner;

public class DistinctNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int score = 1;
        System.out.println("Enter the 10 numbers: ");
        int[] count = new int[10];        

        for (int i = 0; i < 10; i++) {
            int num = input.nextInt();            
            if (i == 0) {
                count[i] = num;
            } else {
                if (isDistinct(count, i, num)) {
                    count[score] = num;
                    score = score + 1;
                }
            }
        }

        System.out.println("The total distinct numbers are " + score);
        System.out.println("The distinct numbers are ");
        for (int j = 0; j < score; j++) {
            System.out.print(count[j] + " ");
        }

        input.close(); // Close the scanner to avoid resource leaks
    }

    public static boolean isDistinct(int[] count, int i, int num) {
        for (int j = 0; j < i; j++) {
            if (count[j] == num) {
                return false;
            }
        }
        return true;
    }
}

import java.util.Scanner;

public class ChartDiceSums {

    // Constant for the number of rolls
    public static final int MAX_ROLLS = 1000000;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for number of dice
        System.out.print("How many dice? ");
        int diceNumber = input.nextInt();
        while (diceNumber <= 0) {
            System.out.print("Please enter a positive number for the dice: ");
            diceNumber = input.nextInt();
        }

        // Prompt for number of sides on each die
        System.out.print("How many sides on each dice? ");
        int diceSides = input.nextInt();
        while (diceSides <= 0) {
            System.out.print("Please enter a positive number for the sides: ");
            diceSides = input.nextInt();
        }

        // Display simulation message
        System.out.println("Simulating " + MAX_ROLLS + " dice rolls.");
        
        // Calculate counts of each possible sum occurrence
        int[] count = countOccurrences(diceNumber, diceSides);
        
        // Find the most frequently occurring sum index
        int maxOccurSumIndex = findMaxOccurrenceIndex(count);
        
        // Print the chart of results
        printChart(count, diceNumber, maxOccurSumIndex);

        input.close();
    }

    // Method to count occurrences of each possible sum in dice rolls
    public static int[] countOccurrences(int dice, int sides) {
        int maxSum = dice * sides;
        int[] count = new int[maxSum + 1]; // Array to store frequency of each sum

        for (int i = 0; i < MAX_ROLLS; i++) {
            int sum = rollDice(dice, sides);
            if (sum >= dice && sum <= maxSum) {  // Ensure sum is within bounds
                count[sum]++;
            }
        }
        return count;
    }

    // Method to print the chart of occurrences
    public static void printChart(int[] count, int numOfDice, int maxOccurIndex) {
        int maxOccurrences = count[maxOccurIndex];
        int scale = Math.max(maxOccurrences / 80, 1);  // Scale to fit within 80 characters

        for (int i = numOfDice; i <= count.length-1; i++) {
            System.out.printf("%2d: ", i);  // Display sum
            int numHashes = count[i] / scale;  // Calculate number of hashes to print
            for (int j = 0; j < numHashes; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.printf("Each # represents approximately %d rolls.\n", scale);
    }

    // Method to find the index with the highest occurrence
    public static int findMaxOccurrenceIndex(int[] count) {
        int maxIndex = 0;
        for (int i = 1; i < count.length; i++) {
            if (count[i] > count[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // Helper method to roll dice and get the sum of the results
    public static int rollDice(int dice, int sides) {
        int sum = 0;
        for (int i = 0; i < dice; i++) {
            sum += (int) (Math.random() * sides) + 1;
        }
        return sum;
    }
}

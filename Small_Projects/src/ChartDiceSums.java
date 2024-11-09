import java.util.Scanner;

public class ChartDiceSums {

    public static final int MAX_ROLLS = 1000000;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get number of dice
        System.out.print("How many dice? ");
        int diceNumber = input.nextInt();

        // Ensure number of dice is positive
        while (diceNumber <= 0) {
            System.out.println("Please enter a valid positive number. How many dice? : ");
            diceNumber = input.nextInt();
        }

        // Get number of sides on each die
        System.out.print("How many sides on each dice? ");
        int diceSides = input.nextInt();

        // Ensure number of sides is positive
        while (diceSides <= 0) {
            System.out.println("Please enter the valid positive sides: ");
            System.out.print("How many sides on each dice? ");
            diceSides = input.nextInt();
        }

        // Calculate minimum and maximum possible sums
        int minimumSize = diceNumber;
        int maximumSize = diceNumber * diceSides;
        int arraySize = maximumSize - minimumSize + 1; // Important because index starts from 0, not 1

        System.out.println("Array size is " + arraySize);

        // Initialize arrays
        int[] count = new int[arraySize];
        int[] arr = new int[arraySize];

        // Simulating 1,000,000 dice rolls
        System.out.println("Simulating 1,000,000 dice rolls.");
        oneSimulate(arr, count, diceNumber, diceSides, maximumSize);

        // Initialize and simulate all rolls
        array(arr, maximumSize, minimumSize, count, diceNumber, diceSides);
        simulationAll(arr, count, diceNumber, diceSides, minimumSize);

        // Print final results
        printFinal(count, diceNumber);

        input.close();
    }

    // 1. Array initialization and valuation
    public static void array(int[] arr, int maximumSize, int minimumSize, int[] count, int diceNumber, int diceSides) {
        for (int i = minimumSize; i <= maximumSize; i++) {
            arr[i - minimumSize] = i;
            // Uncomment this if you want to print during initialization
            // System.out.printf("%5d %5d\n", arr[i - minimumSize], count[i - minimumSize]);
        }
    }

    // 2. One time Simulation 
    public static void oneSimulate(int[] arr, int[] count, int diceNumber, int diceSides, int maximumSize) {
        for (int i = 0; i < MAX_ROLLS; i++) {
            int sum = 0;

            // Simulate rolling all 'diceNumber' of dices
            for (int j = 0; j < diceNumber; j++) {
                // Generate a random number between 1 and 'diceSides' for each die
                int randSides = (int) (Math.random() * diceSides) + 1;
                sum += randSides;
            }

            if (sum >= diceNumber && sum <= maximumSize) {
                count[sum - diceNumber]++;
            }
        }
    }

    // 3. Simulate 1 million rolls and count occurrences
    public static void simulationAll(int[] arr, int[] count, int diceNumber, int diceSides, int minimumSize) {
        for (int i = 0; i < MAX_ROLLS; i++) { // Run exactly 1 million simulations
            // Get the sum from one simulation of rolling all the dices
            int sum = sumOfOneRollDice(diceNumber, diceSides);

            if (sum >= minimumSize && sum < minimumSize + count.length) {
                count[sum - minimumSize]++; // Increment corresponding index in count array
            } else {
                System.out.println("Error: Sum out of bounds!"); // Debugging message in case something goes wrong
            }
        }
    }

    // 4. Print final results
    public static void printFinal(int[] count, int diceNumber) {
        for (int i = 0; i < count.length; i++) {
            System.out.printf("%5d %5d\n", i + diceNumber, count[i]);
        }
    }

    // Helper method to simulate one roll
    public static int sumOfOneRollDice(int dice, int sides) {
        int sum = 0;
        for (int i = 0; i < dice; i++) {
            int numberOnDice = (int) (Math.random() * sides) + 1;
            sum += numberOnDice;
        }
        return sum;
    }
}

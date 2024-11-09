import java.util.Scanner;

public class ReversePuzzle {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
    
        System.out.println("What size array (integer >= 3)?");
        int integer = input.nextInt();
        int count[] = new int[integer];
        
        // Initialize the array
        for (int i = 0; i < integer; i++) {
            count[i] = i + 1;
            System.out.printf("%-3d", count[i]); // Print original array count
        }
        
        int[] randomArray = new int[count.length];
        
        // Shuffle the array after initialization
        shuffle(count, randomArray);
        
        System.out.println("\nShuffled Array:");
        for (int i = 0; i < integer; i++) {
            System.out.printf("%-3d", randomArray[i]);
        }
        
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("(Q) quit  (A) reverse left end  (D) reverse right end  (C) reverse center.");
        
        mainProgram(count, randomArray, input);
        
        input.close(); // Close scanner after use
    }

    // Main program loop
    public static void mainProgram(int[] count, int[] randomArray, Scanner input) {    
        int score = 0;
        while (!arraysEqual(count, randomArray)) {
            System.out.print(">");
            String userChoice = input.next().toLowerCase();
            
            if (userChoice.equals("q")) {
                quit();
                System.out.printf("You quit the program after %d moves.\n", score);
                break;
            } else if (userChoice.equals("a")) {
                reverseLeft(randomArray);
                score++;
            } else if (userChoice.equals("d")) {
                reverseRight(randomArray);
                score++;
            } else if (userChoice.equals("c")) {
                reverseCenter(randomArray);
                score++;
            } else {
                System.out.println("Invalid choice. Please select Q, A, D, or C.");
            }

            // Print current state of the shuffled array after each move
            for (int i = 0; i < randomArray.length; i++) {
                System.out.printf("%-3d", randomArray[i]);
            }
            System.out.println();
        }
        
        if (arraysEqual(count, randomArray)) {
            System.out.printf("Congratulations! You solved it in %d moves.\n", score);
        }
    }

    // Custom method to compare two arrays for equality
    public static boolean arraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    // Shuffle the array
    public static void shuffle(int[] count, int[] randomArray) {
        for (int i = 0; i < count.length; i++) {
            randomArray[i] = count[i];
        }

        for (int i = randomArray.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            int temp = randomArray[i];
            randomArray[i] = randomArray[j];
            randomArray[j] = temp;
        }
    }

    // Reverse the left end: from index 0 to n-2
    public static void reverseLeft(int[] array) {
        for (int i = 0, j = array.length - 2; i < j; i++, j--) {
            swap(array, i, j);
        }
    }

    // Reverse the right end: from index 1 to n-1
    public static void reverseRight(int[] array) {
        for (int i = 1, j = array.length - 1; i < j; i++, j--) {
            swap(array, i, j);
        }
    }

    // Reverse the center: from index 1 to n-2
    public static void reverseCenter(int[] array) {
        for (int i = 1, j = array.length - 2; i < j; i++, j--) {
            swap(array, i, j);
        }
    }

    // Swap two elements in an array
    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    // Quit function to indicate quitting
    public static void quit() {
        System.out.println("Quitting the program...");
    }
}

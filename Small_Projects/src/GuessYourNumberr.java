import java.util.Scanner;

public class GuessYourNumberr {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int low = 1;
        int high = 1000;
        int guess;
        int count = 0;

        System.out.println("Pick a number between 1 and 1000, and I will try to guess it.");
        System.out.println("...don't tell me what it is.\n");

        while (low <= high) {
            guess = (low + high) / 2;
            System.out.printf("I think the number is between %d and %d.\n", low, high);
            System.out.printf("I'm going to guess %d.\n", guess);

            printMenu();
            char userOption = getUserOption(input);
            count++;

            // Adjust range based on user's feedback
            if (userOption == 'a') {
                System.out.printf("Go me! It took me only %d guesses.\n", count);
                return;
            } else if (userOption == 'b') {
                low = guess + 1;
            } else if (userOption == 'c') {
                high = guess - 1;
            } else if (userOption == 'q') {
                System.out.printf("You tired! I quit after %d guesses.\n", count);
                return;
            }

            // If low equals high and user still hasn't confirmed, they may have changed their answer
            if (low == high) {
                System.out.printf("I have narrowed it down to one number: %d.\n", low);
                System.out.print("Enter A to confirm or any other character to indicate you changed your number: ");
                userOption = input.next().toLowerCase().charAt(0);
                if (userOption == 'a') {
                    System.out.printf("Go me! It took me only %d guesses.\n", count);
                } else {
                    System.out.println("You changed your number! I quit.");
                }
                break;
            }
        }
        input.close();
    }

    /**
     * Prints the menu of user options:
     *     (A) My guess is correct.
     *     (B) My guess is too low.
     *     (C) My guess is too high.
     *     (Q) Quit.
     **/
    public static void printMenu() {
        System.out.println("(A) My guess is correct.");
        System.out.println("(B) My guess is too low.");
        System.out.println("(C) My guess is too high.");
        System.out.println("(Q) Quit.");
    }

    /**
     * Gets a valid user input that matches one of the menu items.
     * Repeatedly ask the user for input until they produce a correct value.
     * @param input: a Scanner object for reading from the user
     * @return a char containing a lower case character matching a menu option.
     **/
    public static char getUserOption(Scanner input) {
        String userInput;
        do {
            System.out.print("Enter A, B, C, or Q: ");
            userInput = input.next().toLowerCase();
            if (!isValidMenuItem(userInput)) {
                System.out.printf("\"%s\" is not an option.\n", userInput);
            }
        } while (!isValidMenuItem(userInput));

        return userInput.charAt(0);
    }

    /**
     * Check if the String parameter represents one letter that it is a valid menu item option.
     * @param word the String to be checked.
     * @return true if word contains one character representing a single option.
     */
    public static boolean isValidMenuItem(String word) {
        return word.length() == 1 && (word.equalsIgnoreCase("a") || word.equalsIgnoreCase("b") ||
                                      word.equalsIgnoreCase("c") || word.equalsIgnoreCase("q"));
    }
}

import java.util.Scanner;

public class Palindromes {

    public static void main(String[] args) {

        boolean keepPlaying = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------\nWelcome to the palindrome checker!\n----------------------------------");

        while (keepPlaying) {
            System.out.println("Enter a potential palindrome below. If you've had enough, type 'E' to exit.");
            String userInput = scanner.nextLine();
            userInput = userInput.toLowerCase();
            if (userInput.equals("e")){
                keepPlaying = false;
                break;
            }
            boolean result = Tools.isPalindrome(userInput);
            if (result == true) {
                System.out.println("That's a palindrome! Nice!\nWould you like to print it in box form? (y/n)");
                // user is asked whether they want to print it in box form or not;
                // a placeholder called "palindrome" is made so that the userInput can change
                String palindrome = userInput;
                userInput = scanner.nextLine();
                if (userInput.toLowerCase().equals("y")){
                    Tools.printBox(palindrome);
                }
            }
            else {
                System.out.println("Sorry, that's not a palindrome!\n");
            }
        }
        System.out.println("Goodbye.");
    }
}

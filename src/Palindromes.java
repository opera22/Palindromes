import java.util.Scanner;

public class Palindromes {

    public static void main(String[] args) {

        boolean keepPlaying = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the palindrome checker!");

        /*for (int i = 0; i < 10; i++){

            System.out.println("|");
            System.out.println("\b");
            System.out.println("/");
            System.out.println("\b");
            System.out.println("-");
            System.out.println("\b");
            System.out.println("\\");
            System.out.println("\b");

        }
        System.out.println("hi");*/

        while (keepPlaying) {
            System.out.println("Enter a potential palindrome. Alternatively, type 'E' to exit.");
            String userInput = scanner.nextLine();
            userInput = userInput.toLowerCase();
            if (userInput.equals("e")){
                keepPlaying = false;
            }

            




        }

        System.out.println("we're done here");
    }
}

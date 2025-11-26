import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name > ");
        String userInput = input.nextLine();

        String predefined = "Carmen";

        if (predefined.equals(userInput)) {
            System.out.println(predefined + " equals " + userInput);
        } else { 
            System.out.println(predefined + " does not equal " + userInput);
        }

    }
}

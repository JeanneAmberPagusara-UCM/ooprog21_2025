import java.util.Scanner;

public class BankBalance2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance;
        final double INTEREST_RATE = 0.03; 
        int year = 0;
        int choice;

        System.out.print("Enter initial bank balance > ");
        balance = input.nextDouble();

        do {
            System.out.println("\nDo you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            choice = input.nextInt();

            if (choice == 1) {
                year++;
                balance += balance * INTEREST_RATE;
                System.out.printf("After year %d at %.2f interest rate, balance is $%.4f\n",
                        year, INTEREST_RATE, balance);
            }

        } while (choice == 1);

        System.out.println("End of Program.");
        input.close();
    }
}

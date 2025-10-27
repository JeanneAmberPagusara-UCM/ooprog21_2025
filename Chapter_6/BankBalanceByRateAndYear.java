import java.util.Scanner;

public class BankBalanceByRateAndYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double initialBalance;
        double balance;
        double[] rates = {0.02, 0.03, 0.04, 0.05};

        System.out.print("Enter initial bank balance > ");
        initialBalance = input.nextDouble();

        for (int i = 0; i < rates.length; i++) {
            double rate = rates[i];
            balance = initialBalance;

            System.out.printf("\nWith an initial balance of $%.1f at an interest rate of %.2f\n", initialBalance, rate);

            for (int year = 1; year <= 4; year++) {
                balance += balance * rate;
                System.out.printf("After year %d balance is $%.4f\n", year, balance);
            }
        }

        System.out.println("\nProgram complete.");
        input.close();
    }
}

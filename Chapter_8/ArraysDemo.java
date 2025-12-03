import java.util.Scanner;

public class ForexExchangeSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] currencies = {"USD", "EUR", "JPY", "GBP", "AUD"};
        double[][] rates = new double[5][5]; 

        for (int i = 0; i < currencies.length; i++) {
            System.out.println("Currency: " + currencies[i]);
            for (int day = 0; day < 5; day++) {
                System.out.print("Rate on Nov " + (day + 1) + ": ");
                rates[i][day] = sc.nextDouble();
            }
            System.out.println();
        }
        System.out.println("===================== FOREX SUMMARY (Nov 1 – Nov 5) ======================");
        System.out.println("Currency | Nov1  Nov2  Nov3  Nov4  Nov5   Peak  Lowest");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < currencies.length; i++) {
            System.out.print(currencies[i] + "      | ");

            double peak = rates[i][0];
            double low = rates[i][0];

            for (int day = 0; day < 5; day++) {
                System.out.printf("%.2f  ", rates[i][day]);

                if (rates[i][day] > peak) peak = rates[i][day];
                if (rates[i][day] < low) low = rates[i][day];
            }

            System.out.printf(" %.2f   %.2f\n", peak, low);
        }

        System.out.println("--------------------------------------------------------------------------\n");

        System.out.println("=== DAILY CHANGES (Comparison From Previous Day) ===");
        System.out.println("(+ increase / - decrease / No change for same value)\n");

        for (int i = 0; i < currencies.length; i++) {
            System.out.println("Currency: " + currencies[i]);
            for (int day = 0; day < 4; day++) {
                double diff = rates[i][day + 1] - rates[i][day];

                System.out.print("Nov " + (day + 1) + " -> Nov " + (day + 2) + ": ");

                if (diff > 0) {
                    System.out.printf("+ %.2f\n", diff);
                } else if (diff < 0) {
                    System.out.printf("- %.2f\n", Math.abs(diff));
                } else {
                    System.out.println("No Change");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}

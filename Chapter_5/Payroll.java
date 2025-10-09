import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many hours did you work this week? ");
        int hoursWorked = input.nextInt();

        System.out.print("What is your regular pay rate? ");
        double rate = input.nextDouble();

        Employee emp = new Employee(1, rate);

        double regularPay = emp.getRegularPay(hoursWorked);
        double overtimePay = emp.getOvertimePay(hoursWorked);

        System.out.println("Regular pay is " + regularPay);
        System.out.println("Overtime pay is " + overtimePay);
    }
}

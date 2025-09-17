public class DemoGrossPay {

    public static double calculateGrossPay(double hours, double rate) {
        return hours * rate;
    }

    public static void displayResult(double hours, double rate) {
        double grossPay = calculateGrossPay(hours, rate);
        System.out.println(hours + " hours at $" + rate + " per hour is $" + grossPay);
    }

    public static void main(String[] args) {
        double payRate = 22.75;

        displayResult(10.0, payRate);
        displayResult(25.0, payRate);
        displayResult(37.5, payRate);
    }
}

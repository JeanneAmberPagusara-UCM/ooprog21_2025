public class Employee {
    private int employeeNumber;
    private double payRate;
    private static final int MAX_EMP_NUMBER = 9999;
    private static final double MAX_RATE = 60.00;
    private static final double OVERTIME_RATE = 1.5;

    public Employee(int empNumber, double rate) {
        if (empNumber > MAX_EMP_NUMBER)
            empNumber = MAX_EMP_NUMBER;
        if (rate > MAX_RATE)
            rate = MAX_RATE;
        employeeNumber = empNumber;
        payRate = rate;
    }

    public double getRegularPay(int hoursWorked) {
        int regularHours = Math.min(hoursWorked, 40);
        return regularHours * payRate;
    }

    public double getOvertimePay(int hoursWorked) {
        if (hoursWorked > 40) {
            int overtimeHours = hoursWorked - 40;
            return overtimeHours * payRate * OVERTIME_RATE;
        } else {
            return 0.0;
        }
    }

    public double getPayRate() {
        return payRate;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }
}

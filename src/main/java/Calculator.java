import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operator;
        double num1, num2, result;

        do {
            // Get numbers from the user
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();
            System.out.print("Choose an operator (+, -, *, or /): ");
            operator = scanner.next().charAt(0);
            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();

            // Make calculation based on operator
            result = calculate(num1, num2, operator);

            // Print result
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

            // Ask user to continue
            System.out.print("Do you want to Make another calculation? (y/n): ");

        } while (scanner.next().toLowerCase().charAt(0) == 'y');

        System.out.println("Exiting calculator...");
        scanner.close();
    }

    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new IllegalArgumentException("Division by zero");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}


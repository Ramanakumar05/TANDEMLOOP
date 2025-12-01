import java.util.*;

class Calculator {
    double a;
    double b;

    Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double calculate(String operation) {

        switch (operation.toLowerCase()) {

            case "add":
                return a + b;

            case "subtract":
                return a - b;

            case "multiply":
                return a * b;

            case "divide":
                if (b == 0) {
                    System.out.println("Oops! You can't divide by zero.");
                    return 0;
                }
                return a / b;

            default:
                System.out.println("Invalid operation! Please try again.");
                return 0;
        }
    }
}

public class Program1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        sc.nextLine(); 

        System.out.print("Choose operation (add / subtract / multiply / divide): ");
        String operation = sc.nextLine();

        Calculator calc = new Calculator(a, b);

        double result = calc.calculate(operation);

        System.out.println("Final Result = " + result);
    }
}


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Calculatorrrr");
        System.out.println("Enter a command:");

        String input = "n";
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        while (!input.equals("Q")) {
            input = scanner.next();
            int a = 0;
            int b = 0;
            switch (input) {
                case "add":
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    System.out.println(calculator.add(a, b));
                    break;
                case "subtract":
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    System.out.println(calculator.subtract(a,b));
                    break;
                case "multiply":
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    System.out.println(calculator.multiply(a,b));
                    break;
                case "divide":
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    System.out.println(calculator.divide(a,b));
                    break;
                case "fibonacci":
                    a = scanner.nextInt();
                    System.out.println(calculator.fibonacciNumberFinder(a));
                    break;
                case "binary":
                    a = scanner.nextInt();
                    System.out.println(calculator.intToBinaryNumber(a));
                    break;
                case "Q":
                    break;
            }

        }
    }
}

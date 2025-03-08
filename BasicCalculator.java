import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Choose operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        
        switch (operation) {
            case '+':
                System.out.println("Result: " + add(num1, num2));
                break;
            case '-':
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case '*':
                System.out.println("Result: " + multiply(num1, num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Result: " + divide(num1, num2));
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operation!");
        }
        
        scanner.close();
    }
    
    static double add(double a, double b) {
        return a + b;
    }
    
    static double subtract(double a, double b) {
        return a - b;
    }
    
    static double multiply(double a, double b) {
        return a * b;
    }
    
    static double divide(double a, double b) {
        return a / b;
    }
}

/*
Example Input/Output:
Enter first number: 10
Enter second number: 5
Choose operation (+, -, *, /): *
Result: 50.0

Enter first number: 9
Enter second number: 3
Choose operation (+, -, *, /): /
Result: 3.0
*/

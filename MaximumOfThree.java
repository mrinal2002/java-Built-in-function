import java.util.Scanner;

public class MaximumOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = getInput(scanner, "Enter first number: ");
        int num2 = getInput(scanner, "Enter second number: ");
        int num3 = getInput(scanner, "Enter third number: ");
        
        System.out.println("Maximum number: " + findMax(num1, num2, num3));
        scanner.close();
    }
    
    static int getInput(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextInt();
    }
    
    static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}

/*
Example Input/Output:
Enter first number: 10
Enter second number: 25
Enter third number: 15
Maximum number: 25
*/

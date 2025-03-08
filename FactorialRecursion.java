import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        System.out.println("Factorial of " + num + " is: " + factorial(num));
        
        scanner.close();
    }
    
    static long factorial(int n) {
        return (n <= 1) ? 1 : n * factorial(n - 1);
    }
}

/*
Example Input/Output:
Enter a number: 5
Factorial of 5 is: 120

Enter a number: 7
Factorial of 7 is: 5040
*/

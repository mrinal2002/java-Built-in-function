import java.util.Scanner;

public class GCD_LCM_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm(num1, num2));
        
        scanner.close();
    }
    
    static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
    
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}

/*
Example Input/Output:
Enter first number: 12
Enter second number: 18
GCD of 12 and 18 is: 6
LCM of 12 and 18 is: 36

Enter first number: 7
Enter second number: 5
GCD of 7 and 5 is: 1
LCM of 7 and 5 is: 35
*/

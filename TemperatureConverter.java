import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();
        
        System.out.print("Convert to (C/F): ");
        char unit = scanner.next().charAt(0);
        
        if (unit == 'C' || unit == 'c') {
            System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(temp));
        } else if (unit == 'F' || unit == 'f') {
            System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temp));
        } else {
            System.out.println("Invalid unit!");
        }
        
        scanner.close();
    }
    
    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    
    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}

/*
Example Input/Output:
Enter temperature: 100
Convert to (C/F): C
Temperature in Celsius: 37.77777777777778

Enter temperature: 0
Convert to (C/F): F
Temperature in Fahrenheit: 32.0
*/

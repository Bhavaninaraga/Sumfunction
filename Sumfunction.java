import java.util.Scanner;

public class Sumfunction {
    
    // Function to calculate the sum of two numbers
    public static int sum(int a, int b) {
        return a + b;  // Return the sum of the two numbers
    }

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Call the sum function and display the result
        int result = sum(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
        
        // Close the scanner
        scanner.close();
    }
}


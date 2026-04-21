import java.util.Scanner; // Import Scanner class for user input

public class BasicJavaExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // 1. Print a welcome message
        System.out.println("Welcome to Basic Java Example!");

        // 2. Variables and user input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // 3. Conditional statement
        if (age >= 18) {
            System.out.println("Hello " + name + "! You are an adult.");
        } else {
            System.out.println("Hello " + name + "! You are a minor.");
        }

        // 4. Simple loop
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // 5. Close the scanner
        scanner.close();
    }
}

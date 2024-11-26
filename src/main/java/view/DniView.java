package view;

import java.util.Scanner;

public class DniView {

    private final Scanner scanner = new Scanner(System.in);

    public int getDniInput() {
        System.out.print("Enter your DNI number (0-99999999): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next(); // Clear invalid input
        }
        return scanner.nextInt();
    }

    public void displayDniLetter(char letter) {
        System.out.println("The letter corresponding to your DNI is: " + letter);
    }

    public void displayError(String message) {
        System.out.println(message);
    }

    public void close() {
        scanner.close();
    }
}

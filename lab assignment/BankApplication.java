package main;

import banking.BankingSystem;
import utils.PinValidator;
import java.util.Scanner;
import java.io.Console;

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Console console = System.console();

        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();  

        System.out.print("Enter PIN: ");
        String pin = new String(console.readPassword());

        if (PinValidator.Rules.isValid(pin)) {
            if (BankingSystem.LoginProcessor.authenticate(accountNumber, pin)) {
                System.out.println("Login Successful!");
            } else {
                System.out.println("Error: Incorrect Account Number or PIN.");
            }
        } else {
            System.out.println("Error: PIN must be exactly 4 digits.");
        }

    
    }
}

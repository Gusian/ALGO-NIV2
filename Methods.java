import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Methods {


    
 public static float lireFloat(Scanner scanner, String message) {
    System.out.print(message);
    try {
        float valeur = scanner.nextFloat();
        scanner.nextLine(); 
        return valeur;
    } catch (Exception e) {
        scanner.nextLine(); 
        System.out.println("Erreur de saisie. Réessayez.");
        return lireFloat(scanner, message); 
    }}

    public static int lireInt(Scanner scanner, String message) {
    System.out.print(message);
    try {
        int valeur = scanner.nextInt();
        scanner.nextLine();
        return valeur;
    } catch (Exception e) {
        scanner.nextLine(); 
        System.out.println("Erreur de saisie. Réessayez.");
        return lireInt(scanner, message); 
    }}

    public static String lireString(Scanner scanner, String message) {
    System.out.print(message);
    try {
        return scanner.nextLine();
    } catch (Exception e) {
        System.out.println("Erreur de saisie.");
        return lireString(scanner, message); 
    }
}

public static LocalDate lireDate(Scanner scanner, String message, DateTimeFormatter formatter) {
    System.out.print(message);
    try {
        String input = scanner.nextLine();
        return LocalDate.parse(input, formatter);
    } catch (DateTimeParseException e) {
        System.out.println("Format invalide.");
        return lireDate(scanner, message, formatter);
    }
}


public static LocalTime lireTime(Scanner scanner, String message, DateTimeFormatter formatter) {
    System.out.print(message);
    try {
        String input = scanner.nextLine();
        return LocalTime.parse(input, formatter);
    } catch (DateTimeParseException e) {
        System.out.println("Format invalide.");
        return lireTime(scanner, message, formatter);
    }
}

    public static boolean lireBoolean(Scanner scanner,boolean response, String message) {
    System.out.print(message);
   // Clear the buffer
    try {
        response = scanner.nextBoolean();
        return response;

    } catch (Exception e) {


        System.out.println("Erreur de saisie.");
         scanner.nextLine(); 
        return lireBoolean(scanner,response, message); 
    }

            

}


    
}

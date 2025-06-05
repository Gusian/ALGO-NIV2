import java.util.Scanner;
import java.util.Random;
public class exoQ6 {
    public static void main(String[]args) {

        int randomNumber;
        int solution;
        int userGuess=-1;
        int attempts=0;
        int hint1;
        int hint2;
        
        Scanner clavier = new Scanner(System.in);
        Random random = new Random();
        
        randomNumber = random.nextInt(100);
        solution= randomNumber;
        randomNumber = random.nextInt(15);
        hint1 = solution - randomNumber;
        if (hint1 < 0) {
            hint1 = 0; 
        }
        randomNumber = random.nextInt(15);
        hint2 = solution + randomNumber;
        if (hint2 > 100) {
            hint2 = 100;
        }

        System.out.println("Une valeur a été choisie entre 0 et 100. Essayez de la deviner !");

        while ( userGuess!= solution ) {

            attempts++;
            
            if (attempts==1) {
            System.out.println("Saisir votre "+attempts+ "ere proposition :");
            
            }else if (attempts==4) {
            System.out.println("Indice : La valeur est entre " + hint1 + " et " + hint2+"\nSaisir votre "+ attempts + "eme proposition :");

             }else if (attempts>4) {
            System.out.println("La valeur est entre " + hint1 + " et " + hint2+"\nSaisir votre "+ attempts + "eme proposition :");

            }else{
            System.out.println("La valeur est entre 0 et 100\nSaisir votre "+attempts+ "eme proposition :");
            }
            userGuess = clavier.nextInt();

        }

        System.out.println("Bravo ! Vous avez trouvé en " + attempts + " essais.");
        clavier.close();







    }
}
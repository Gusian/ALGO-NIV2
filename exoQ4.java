import java.util.Scanner;
public class exoQ4 {
    public static void main(String[]args) {

        int entier; 
        int diviseur;
        String message = "";
        Scanner clavier = new Scanner(System.in);

        System.out.println("Saisir un entier :");
        entier = clavier.nextInt();

        for (diviseur = 1; diviseur < entier; diviseur++) {
            if (entier % diviseur == 0) {
                message += diviseur + " ";
            }
        }

        System.out.println("Les diviseurs de " + entier + " (hors lui même) sont : " + message);
        clavier.close();


    }
}
import java.util.Scanner;
public class exoQ1 {
    public static void main(String[]args) {

        String prénom;
        System.out.println("Saisir votre prénom :");
        
         Scanner clavier = new Scanner(System.in);
        prénom=clavier.nextLine();

        while (prénom.length() < 2) {
            System.out.println("Votre prénom doit comprendre au moins 2 caractères\nSaisir votre prénom à nouveau:");
            prénom = clavier.nextLine();
        }


        System.out.println("Bonjour " + prénom + " !");
        clavier.close();

    }
}
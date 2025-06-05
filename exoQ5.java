import java.util.Scanner;
public class exoQ5 {
    public static void main(String[]args) {

        int N; 
        int diviseur;
        Scanner clavier = new Scanner(System.in);

        System.out.println("Saisir un entier :");
        N = clavier.nextInt();
        String message = N+ " est un nombre premier";

        for (diviseur = 2; diviseur < N; diviseur++) {
            if (N % diviseur == 0) {
                message = N+" n'est pas un nombre premier";  
        }
    }

        System.out.println(message);
        clavier.close();


    }
}
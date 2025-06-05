import java.util.Scanner;
public class exoQ7 {
    public static void main(String[]args) {

        int S;
        int store=0;
        float solde;
        Scanner clavier = new Scanner(System.in);

        System.out.println("Barnabé fait ses courses, entrer l'argent qu'il possède :");
         S = clavier.nextInt();

        while (S<=1) {

        System.out.println("Barnabé doit avoir au moins avoir 2 euros pour faire ses courses,\n entrer à nouveau l'argent qu'il possède :");
        S = clavier.nextInt();

        }
        

        for (solde=S; solde>=1.5; solde=solde-(solde/2+1)) {
            store++;
        } 

        System.out.println("Barnabé a pu acheter dans " + store + " magazin");
        clavier.close();

    }
}
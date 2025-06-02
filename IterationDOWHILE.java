import java.util.Scanner;

public class IterationDOWHILE {


        public static void main(String[] args) {

            int bottle = 100;

            Scanner clavier = new Scanner(System.in);     

            do { 

                System.out.println("il reste " + bottle + " cl d'eau");

                System.out.println("Combien de cl d'eau voulez-vous boire ?");

              bottle = bottle - clavier.nextInt();
                
            } while ( bottle > 0);

            System.out.println("Vous avez bu toute l'eau !");

            clavier.close();
            
    }
}    
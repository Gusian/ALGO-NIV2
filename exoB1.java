import java.util.Scanner;

public class exoB1 {
    public static void main(String[]args) {

    int nombre=1;

     Scanner clavier = new Scanner(System.in);

    while (nombre!=2){

        System.out.println("Choisissez un nombre entre 1 et 3 :");
        nombre = clavier.nextInt();

        if (nombre<1 || nombre>3) {
            System.out.println("Nombre invalide, veuillez réessayer.");
            
        }else {
            switch (nombre) {
                case 1:
                    System.out.println("Perdu ! recommencez.");
                    break;
                case 2:
                    System.out.println("Bravo, vous avez réussi ! :)");
                    break;
                case 3:
                    System.out.println("Perdu ! recommencez.");
                    break;
                default:
                    System.out.println("Nombre non reconnu.");
            }
        }


    }

    System.out.println("Merci d'avoir joué !");
    clavier.close();


    }
}
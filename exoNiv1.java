import java.util.Scanner;

public class exoNiv1 {
    public static void main(String[]args) {
    
    boolean steak =false;
    boolean cuisson=false;
    boolean frites =false;
    boolean soda =false;
    int compt=0;
      Scanner clavier = new Scanner(System.in);

    while (compt<4) {

        switch(compt) {
            case 0:
        System.out.println("Voulez-vous un steak ? (true/false)");
        steak = clavier.nextBoolean();
        if (steak) {
            compt+=1;
        }else{
            compt+=2;
        }
        break;
            case 1:
        System.out.println("Votre steak vous le voulez saignant (true) ou à poing (false) ? ");
        cuisson = clavier.nextBoolean();
        compt+=1;
        break;
            case 2:
        System.out.println("Frites (true) ou riz (false)");
        frites = clavier.nextBoolean();
        compt+=1;
        break;
            case 3:
        System.out.println("Soda (true) ou eau gazeuse (false");
        soda = clavier.nextBoolean();
        compt+=1;
        break;
        default:        
        System.out.println("Erreur de saisie, veuillez recommencer.");
        }

    }

    System.out.println("Merci pour votre commande, ça sera près dans 20min ");
    clavier.close();

    }

}

import java.util.Scanner;
public class exoQ2 {
    public static void main(String[]args) {

        String mdp="formation";
        System.out.println("Saisir votre mot de passe :");
        String vmdp;
        int i=0;
        
        Scanner clavier = new Scanner(System.in);
        vmdp=clavier.nextLine();

        while (!vmdp.equals(mdp)&&i<2) {
            i++;
            System.out.println("Mot de passe incorrect, "+(3-i)+" essais restants.\n Saisir votre mot de passe à nouveau:");
            vmdp = clavier.nextLine();
        }

        if (i==2&&!vmdp.equals(mdp)){

            System.out.println("Votre compte est bloqué !");
            

        }else{


        System.out.println("Vous êtes connecté !");

        }

        clavier.close();

    }
}
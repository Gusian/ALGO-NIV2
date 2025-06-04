import java.util.Scanner;
public class exoB8 {
    public static void main(String[]args) {

        Scanner clavier = new Scanner(System.in);
        float prix=1;
        float somme=0;
        int billet;
        int monnaie1;
        int monnaie2;
        int monnaie3;
        int monnaie4;
        int monnaie5;

        while (prix!=0) {
            System.out.println("Saisir un prix :");
            prix = clavier.nextFloat();
            somme = prix+somme;
        }

        
        somme = Math.round(somme * 10) / 10.0f; 

        System.out.println("Le client doit payer " + somme);

        billet = (int)somme/5 ;

          somme = somme - billet * 5;

        if (somme > 0) {

            billet = billet + 1;
            somme = 5- somme;
            somme = Math.round(somme * 10) / 10.0f;
             
            System.out.println("Le client doit donner "+billet+" billets de 5 euros");
             System.out.println("Rendu monnaie : " + somme + " euros");
             
             monnaie1 = (int)somme /2;
             somme = somme - monnaie1 * 2;
             
             monnaie2 = (int)somme ;
             somme = somme - monnaie2;
             
             monnaie3 = (int)(somme / 0.5f);
            somme = somme - monnaie3 * 0.5f;

            monnaie4 = (int)(somme / 0.2f);
            somme = somme - monnaie4 * 0.2f;

            monnaie5 = (int)(somme / 0.1f);
            

             System.out.println(monnaie1 + " pièces de 2 euros");
             System.out.println(monnaie2 + " pièces de 1 euro");
             System.out.println(monnaie3 + " pièces de 50 centimes");
             System.out.println(monnaie4 + " pièces de 20 centimes");
             System.out.println(monnaie5 + " pièces de 10 centimes");


        }
        
        clavier.close();

    }
}
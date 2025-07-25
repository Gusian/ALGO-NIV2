import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class exoNiv1 {
    public static void main(String[]args) {
    
    boolean steak =false;
    boolean cuisson=false;
    boolean frites =false;
    boolean soda =false;
    int compt=0;
    LocalTime heure = LocalTime.now();
    LocalTime heureCommande= heure.plusMinutes(20);
    Scanner clavier = new Scanner(System.in);
    DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm");
    


    while (compt<4) {

        try {

        
        switch(compt) {
            case 0:
        System.out.println("Voulez-vous un steak ? (true/false)");
        steak = clavier.nextBoolean();
        if (steak) {
            compt+=1;
            heureCommande = heureCommande.plusMinutes(20);
        }else{
            compt+=2;;
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
        System.out.println("Soda (true) ou eau gazeuse (false)");
        soda = clavier.nextBoolean();
        compt+=1;
        break;
    
        
    
        default:        
        System.out.println("Erreur de saisie, veuillez recommencer.");
        }
    }catch (Exception e) {
        System.out.println("Erreur de saisie");
        compt-=1;
        
    }
}

    String heureFormat = heureCommande.format(format);

    System.out.println("Merci pour votre commande, ça sera prête à " + heureFormat + " !");
    clavier.close();

    

}
}

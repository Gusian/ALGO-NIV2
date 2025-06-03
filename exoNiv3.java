import java.util.Scanner;

public class exoNiv3 {
    public static void main(String[]args) {

        float solde; 

        Scanner clavier = new Scanner(System.in);

        System.out.println("Quel est votre solde ?");
        
        solde = clavier.nextFloat();  

        int choix=2;

        float action=10;

        System.out.println("Bienvenu sur votre compte bancaire, que puis-je faire pour vous :");

        while (choix >0) {

            System.out.println("(0) Quitter"+System.lineSeparator()+"(1) Retirer de l'argent"+System.lineSeparator()+"(2) Consulter votre solde"+System.lineSeparator()+"(3) Déposer de l'argent");
            choix = clavier.nextInt();

            switch(choix) {
                case 1:
                    System.out.println("Combien voulez-vous retirer ?");
                    action = clavier.nextFloat();
                 
                    if (solde-action >=-500){
                    
                        if (action%10 ==0) {
                            solde -= action;
                            System.out.println("Opération acceptée : "+action+"euros ont été retirés de votre compte,"+System.lineSeparator()+"voulez vous faire autres choses ?");
                          
                        }else{

                         System.out.println("Désolé,vous ne pouvez retirer que des billets d'au moins 10euros"+System.lineSeparator()+"voulez vous faire autres choses ?");
                        }
                    }else {
                        System.out.println("Désolé, vous ne pouvez pas retirer plus de 500euros de découvert,"+System.lineSeparator()+"voulez vous faire autres choses ?");
                    }
                    
                     break;
                case 2:  
                    System.out.println("Votre solde est de "+solde+"euros,"+System.lineSeparator()+"voulez vous faire autres choses ?");
                    break;  
                case 3:
                    System.out.println("Combien d'argent voulez-vous déposer ?");
                    action = clavier.nextFloat();
                    
                    if (action%5 ==0) {
                        solde += action;
                        System.out.println("Opération acceptée : "+action+"euros ont été déposés sur votre compte,"+System.lineSeparator()+"voulez vous faire autres choses ?");
                    }else{
                        System.out.println("Désolé,vous ne pouvez déposer que des billets "+System.lineSeparator()+"voulez vous faire autres choses ?");
                    }
                    break;
            }}

            System.out.println ("Merci de votre visite, au revoir :)");

            clavier.close();
                    
                  

            



        


    }}
        
    
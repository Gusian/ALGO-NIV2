import java.util.Scanner;
public class intro3 {

     public static String valTab (String [] tab, int i) {

      
            return tab[i];
       
    }

    public static void listVilles (String [] villes) {
        
        for (int i = 0; i < villes.length; i++) {
        
            System.out.println(i + " - " + villes[i]);
        }

    }
    public static void main(String[]args) {

    int i=0 ;
    int c=0;
    boolean continuer = true;
    Scanner scanner = new Scanner(System.in);   
    
    String [] tab = {"Bienvenue à Paris !","Welcome to London !","Bienvenido a Madrid !","Bem-vindo a Lisboa !","Willkommen in Berlin !"};  
    String [] villes = {"Paris","Londres","Madrid","Lisbonne","Berlin"}; 

   
   
   
    System.out.println("Bonjour, quelle ville souhaitez-vous visiter ?\n");
    listVilles(villes);

    
     while (continuer) {
      if (c>0) {
        
        System.out.println("quelle ville souhaitez-vous visiter ?\n");
        listVilles(villes);}
    c++;
    try {
        i = scanner.nextInt();
        System.out.println(valTab(tab, i));
    } catch (Exception e) {
        System.out.println("Désolé, cette ville n'est pas sur la liste !");

    }
    
    System.out.println("Souhaitez vous visitez une autre ville ? (true/false)");
    try {
        continuer = scanner.nextBoolean();
    } catch (Exception e) {
        System.out.println("Erreur de saisie");
        continuer = false;
    }
    
}
    scanner.close();
    System.out.println("Votre voyage est terminé :) !");   
}
}
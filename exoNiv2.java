import java.util.Scanner;
public class exoNiv2 {
    public static void main(String[]args) {

        String produit="";
        float prix=0;
        float tprix=0;
        boolean encore= true;
        int ligne=0;
         Scanner clavier = new Scanner(System.in);

        
     

        while(encore==true) {

            ligne++;
            produit += ligne+"  ";
            System.out.println("Quel produit voulez-vous acheter ?");
            produit += clavier.next()+"  ";
            System.out.println("Quel est le prix de ce produit ?");
            prix =clavier.nextFloat();
            tprix= tprix + prix;
            produit += prix+" euros\r";
            
             
            System.out.println("Voulez vous acheter un autre produit ? (true/false)");
            encore = clavier.nextBoolean();
           
        }   

        System.out.println(produit+"prix des courses : "+tprix+" euros");

         System.out.println("Voulez-vous supprimer un produit ? (true/false)");
        boolean supprimer = clavier.nextBoolean();

        if (supprimer) {
            System.out.println("Entrez le numéro de ligne du produit à supprimer :");
            int numLigne = clavier.nextInt();

                        String[] lignes = produit.split(System.lineSeparator());
            String nouveauProduit = "";
            for (String ligneProduit : lignes) {
               
                    nouveauProduit += ligneProduit + System.lineSeparator();
                
            }

            produit = nouveauProduit;

            System.out.println("Produit supprimé.");
            System.out.println("Liste mise à jour des achats :\n" + produit);
        }




        clavier.close();
    }
}

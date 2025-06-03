import java.util.Scanner;

public class exoNiv2Bis{
    public static void main(String[] args) {
        String produit = "";
        float prix = 0;
        float tprix = 0;
        boolean encore = true;
        int ligne = 0;
        Scanner clavier = new Scanner(System.in);

        while (encore) {
            ligne++;
            System.out.println("Quel produit voulez-vous acheter ?");
            String nomProduit = clavier.nextLine();
            System.out.println("Quel est le prix de ce produit ?");
            prix = clavier.nextFloat();
            tprix += prix;
            
            produit += ligne + ":" + nomProduit + " " + prix + " euros" + System.lineSeparator();

            System.out.println("Voulez-vous acheter un autre produit ? (true/false)");
            encore = clavier.nextBoolean();
        }

        // Affichage des produits
        System.out.println("Liste des achats :\n" + produit);
        System.out.println("Prix total des courses : " + tprix + " euros");

        // Suppression d'une ligne
        System.out.println("Voulez-vous supprimer un produit ? (true/false)");
        boolean supprimer = clavier.nextBoolean();

        if (supprimer) {
            System.out.println("Entrez le numéro de ligne du produit à supprimer :");
            int numLigne = clavier.nextInt();

            String[] lignes = produit.split(System.lineSeparator());
            String nouveauProduit = "";
            float nouveauTprix = 0;

            for (String ligneProduit : lignes) {
                if (!ligneProduit.startsWith(numLigne + ":")) {
                    nouveauProduit += ligneProduit + System.lineSeparator();
                    
                    // Récupération du prix du produit restant
                    String[] elements = ligneProduit.split(" ");
                    float prixProduit = Float.parseFloat(elements[elements.length - 2]); // Avant "euros"
                    nouveauTprix += prixProduit;
                }
            }

            produit = nouveauProduit;
            tprix = nouveauTprix;

            System.out.println("Produit supprimé.");
            System.out.println("Liste mise à jour des achats :\n" + produit);
            System.out.println("Prix total des courses après suppression : " + tprix + " euros");
        }

        clavier.close();
    }
}

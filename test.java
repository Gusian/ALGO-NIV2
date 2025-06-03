import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String produit = "";
        float prix = 0;
        float tprix = 0;
        int ligne = 0;
        Scanner clavier = new Scanner(System.in);
        String reponse;

        // Boucle d'achat
        while (true) {
            ligne++;
            System.out.println("Quel produit voulez-vous acheter ?");
            // On lit la ligne complète pour permettre les espaces
            String nomProduit = clavier.nextLine();

            System.out.println("Quel est le prix de ce produit ?");
            // Lire le prix sous forme de chaine et le parser
            try {
                prix = Float.parseFloat(clavier.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Prix invalide. Veuillez saisir un nombre.");
                ligne--; // on ne comptabilise pas cette ligne
                continue;
            }
            tprix += prix;

            produit += ligne + ":" + nomProduit + " " + prix + " euros" + System.lineSeparator();

            System.out.println("Voulez-vous acheter un autre produit ? (true/false)");
            reponse = clavier.nextLine();
            // On teste la réponse (on peut améliorer pour accepter OUI/NON si souhaité)
            if (!Boolean.parseBoolean(reponse)) {
                break;
            }
        }

        // Affichage des produits et du prix total
        System.out.println("Liste des achats :\n" + produit);
        System.out.println("Prix total des courses : " + tprix + " euros");

        // Option de suppression d'une ligne
        System.out.println("Voulez-vous supprimer un produit ? (true/false)");
        reponse = clavier.nextLine();
        if (Boolean.parseBoolean(reponse)) {
            System.out.println("Entrez le numéro de ligne du produit à supprimer :");
            int numLigne;
            try {
                numLigne = Integer.parseInt(clavier.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Numéro invalide.");
                clavier.close();
                return;
            }

            String[] lignes = produit.split(System.lineSeparator());
            String nouveauProduit = "";
            float nouveauTprix = 0;

            for (String ligneProduit : lignes) {
                // On teste si la ligne commence par le numéro choisi suivi de ":"
                if (!ligneProduit.startsWith(numLigne + ":")) {
                    nouveauProduit += ligneProduit + System.lineSeparator();
                    // On extrait le prix : on suppose que le prix se trouve avant le mot "euros"
                    String[] elements = ligneProduit.split(" ");
                    try {
                        float prixProduit = Float.parseFloat(elements[elements.length - 2]);
                        nouveauTprix += prixProduit;
                    } catch (NumberFormatException e) {
                        // En cas d'erreur, on ignore cette ligne
                    }
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

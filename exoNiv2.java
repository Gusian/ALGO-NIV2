import java.util.Scanner;
public class exoNiv2 {
    public static void main(String[]args) {

        String produit="";
        float prix=0;
        float tprix=0;
        boolean encore= true;
        Scanner clavier = new Scanner(System.in);
        
     

        while(encore==true) {

            System.out.println("Quel produit voulez-vous acheter ?");
            produit += clavier.next()+"  ";
            System.out.println("Quel est le prix de ce produit ?");
            prix =clavier.nextFloat();
            tprix= tprix + prix;
            produit += prix+" euros"+System.lineSeparator();
             
            System.out.println("Voulez vous acheter un autre produit ? (true/false)");
            encore = clavier.nextBoolean();
           
        }   

        System.out.println(produit+"prix des courses : "+tprix+" euros");


        clavier.close();
    }
}

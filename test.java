import java.util.Scanner;
public class test {
    public static void main(String[]args) {

        Scanner clavier = new Scanner(System.in);
        float prix;

       
        System.out.println("Saisir un prix :");
        prix = clavier.nextFloat();
        prix = prix%1;
      

        System.out.println(prix);
        clavier.close();
    }
}

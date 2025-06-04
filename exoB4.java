import java.util.Scanner;
public class exoB4 {
    public static void main(String[]args) {

        int nombre;
        Scanner clavier = new Scanner(System.in);
        System.out.println("Choisissez un nombre");
        nombre = clavier.nextInt();
        int i=0;
        int somme = 0;


        do { 

            i++;
            somme = somme+i;

        } while (i != nombre);

        System.out.println("La somme des nombres jusqu'à " + nombre + " est : " + somme);
            
        

        clavier.close();

    }
}
import java.util.Scanner;

public class exoB5 {
    public static void main(String[]args) {

         int nombre;
        Scanner clavier = new Scanner(System.in);
        System.out.println("Choisissez un nombre");
        nombre = clavier.nextInt();
        int i=0;
        int facto = 1;


        do { 

            i++;
            facto = facto*i;

        } while (i != nombre);

        System.out.println("la factorielle de " + nombre + " est : " + facto);
            
        

        clavier.close();

    }
}

        
import java.util.Scanner;
public class exoB6 {
    public static void main(String[]args) {

        int nombre;
        Scanner clavier = new Scanner(System.in);
        int biggest=-999999999;
        int i;

        for(i=1; i<=20; i++) {

            System.out.println("Choisissez le nombre numéro " + i + " :");
            nombre = clavier.nextInt();
            if (nombre > biggest) {
                biggest = nombre;
            }

            }

        System.out.println("Le plus grand nombre est : " + biggest);
        clavier.close();    




            
        }


    }


        
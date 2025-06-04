import java.util.Scanner;
public class exoB7 {
    public static void main(String[]args) {

        Scanner clavier = new Scanner(System.in);
        int nombre=-999999999;
        int biggest=-999999999;
        int i=0;

        while(nombre != 0) {

            i++;
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

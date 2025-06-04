import java.util.Scanner;
public class exoB2 {
    public static void main(String[]args) {

        int nombre=0;
        Scanner clavier = new Scanner(System.in);;

        while (nombre < 10 || nombre > 20) {

            System.out.println("Choisissez un nombre");
            nombre = clavier.nextInt();

            if (nombre <10){

                System.out.println("Le nombre est trop petit, veuillez réessayer.");
            } else if (nombre > 20) {
                System.out.println("Le nombre est trop grand, veuillez réessayer.");
            }


            
           
    }

        System.out.println("Yes,you did it !");
        clavier.close();
}
}

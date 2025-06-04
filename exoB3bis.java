import java.util.Scanner;

public class exoB3bis {
    public static void main(String[]args) {

        int nombre;
        Scanner clavier = new Scanner(System.in);
        System.out.println("Choisissez un nombre");
        nombre = clavier.nextInt();
        int i = 0;

        while (i<10) {

            i++;
            nombre++;

            System.out.println(nombre);
        }

        clavier.close();   

    }
}
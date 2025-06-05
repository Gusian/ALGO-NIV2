import java.util.Scanner;
public class exoQ3 {
    public static void main(String[]args) {

        int A; 
        int B;
        int result;
        String message = "";
        Scanner clavier = new Scanner(System.in);

        System.out.println("Saisir la valeur de A :");
        A = clavier.nextInt();
        System.out.println("Saisir la valeur de B :");
        B = clavier.nextInt();

        System.out.println("A = " + A + "\n B = " + B);

        if(A>B) {
            result = A;
        } else {
            result = B;
        }

        while (result > A+1|| result > B+1) {

        result--;
        message += result + " ";
       

        }

        System.out.println("Résultat = "+message);
        clavier.close();



    }
}
import java.util.Scanner;
public class exoB9 {
    public static void main(String[]args) {

        int n;
        int p;
        int X;
        int Y;
        int i=0;
        int facto=1;
        int factoN=0;
        int factoP=0;
        int factoNP=0;


        Scanner clavier = new Scanner(System.in);

    System.out.println("Saisir le nombre de chevaux partant :");
    n = clavier.nextInt();
    System.out.println("Saisir le nombre de chevaux joués :");
    p = clavier.nextInt();

     double f=n;

        while (i <= f-1) {
        
        i++;    

        facto=facto*i ;

        if (i==f && f==n) {

            factoN=facto;
            i=0;
            f=p;
            facto=1;
        }
         else if (i==f && f==p) {

            factoP=facto;
            i=0;
            f=n-p;
            facto=1;

        } 

    }

    System.out.println("la factorisation de "+n+" est de "+factoN);

    factoNP = facto;
    X= factoN/factoNP;
    Y= factoN/(factoP*factoNP); 

    System.out.println("Dans l'ordre : une chance sur " + X + " de gagner");
    System.out.println("Dans le désordre : une chance sur " + Y + " de gagner"); 

    
    clavier.close();
    
    }

}

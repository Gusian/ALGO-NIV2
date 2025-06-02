import java.util.Scanner;

public class ex1 {
    public static void main(String[]args) {

        char response ;

        int question= 1;

        Scanner clavier = new Scanner(System.in);

        while (question<6){

            switch(question) {

                case 1 :
                    System.out.print("La capital de la France est Paris (V/F)");
                    response = clavier.next().charAt(0);
                    if (response == 'v' || response == 'V') {
                        System.out.println("Bonne réponse !");
                        question+=1;
                    } else {
                        System.out.println("Mauvaise réponse!");
                    }
                    break;

                case 2 :
                    System.out.print("la tomate est un fruit (V/F)");
                    response = clavier.next().charAt(0);
                    if (response == 'v' || response == 'V'|| response == 'f'|| response == 'F') {
                        System.out.println("Bonne réponse !");
                        question+=1;
                    } else {
                        System.out.println("Mauvaise réponse!");
                    }
                    break;

                case 3 :
                    System.out.print("pluton est une planette (V/F)");
                    response = clavier.next().charAt(0);
                    if (response == 'F' || response == 'f') {
                        System.out.println("Bonne réponse !");
                        question+=1;
                    } else {
                        System.out.println("Mauvaise réponse!");
                    }
                    break;

                case 4 :
                    System.out.print("Je sais coder (V/F)");
                    response = clavier.next().charAt(0);
                    if (response == 'v' || response == 'V') {
                        System.out.println("Bonne réponse !");
                        question+=1;
                    } else {
                        System.out.println("Mauvaise réponse!");
                    }
                    break;

                case 5 :
                    System.out.print("J'aime le code (V/F)");
                    response = clavier.next().charAt(0);
                    if (response == 'v' || response == 'V') {
                        System.out.println("Bonne réponse !");
                         question+=1;
                    } else {
                        System.out.println("Mauvaise réponse!");
                    }
                    break;
            }

        
        }
        
    System.out.println("Vous avez terminé le quiz !");

    clavier.close();
    
    }

}
        
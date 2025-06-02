import java.util.Scanner;

public class IterationWHILE {


    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);              
         System.out.println("Voulez-vous apprendre le développement ?(true/false)");
                
        boolean response=false;
                
        while(response==false){
                    
            System.out.println("Voulez-vous apprendre le développement ?(true/false)");
             response = clavier.nextBoolean();
             System.out.println("Tu es obligé désolé XD !");
                    
        }
                
        System.out.println("Bienvenue en ABC Dev !");
            
        clavier.close();



        
    }

}
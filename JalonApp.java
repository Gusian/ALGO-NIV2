import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class JalonApp {
    public static void main(String[]args) {
        String Fly="Liste des vols :\n\n";
        String Start="";
        String End="";
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate date = null;
        LocalTime dfly= null;
        LocalDateTime dEnd= null;
        boolean add =true;
        LocalTime time= null;
        LocalDateTime dateTime= null;
        LocalDate now = LocalDate.now();
        Float price = 0.0f;
        Float mult = 1.0f;
        int seat = 0;
        int i = 0;

        while (add) {

            i++;

            try {
                System.out.print("Entrez le prix du vol : ");
                price = scanner.nextFloat();
                scanner.nextLine(); 
            } catch (Exception e) {
                System.out.println("Erreur lors de la saisie du prix.");
            }

            try {
            System.out.print("Entrez la ville et Pays de départ du vol : ");
            Start = scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Erreur lors de la saisie de la ville de départ.");
            }

           try {
            System.out.print("Entrez la ville et Pays d'arrivée du vol : ");
            End = scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Erreur lors de la saisie de la ville d'arrivée.");
            }

            try {
                System.out.print("Entrez la date du vol au format (dd MM yyyy) : ");
                String input = scanner.nextLine();
                date = LocalDate.parse(input, formatter);
                   if (date.isBefore(now.plusDays(7))) {
                mult += 0.4f;
            }else if (date.isAfter(now.plusMonths(6))){

                mult -= 0.4f;

            }
                /**System.out.println(date.format(formatter));**/
            } catch (DateTimeParseException e) {
                System.out.println("Format invalide.");
            }

         

            try {
            System.out.print("Entrez l'heure du vol (format: HH:mm) : ");
            String timeInput = scanner.nextLine();
            time = LocalTime.parse(timeInput);
            } catch (DateTimeParseException e) {
                System.out.println("Format d'heure invalide.");
            }

            try {
            dateTime= LocalDateTime.of(date, time);
            } catch (Exception e) {
                System.out.println("Erreur lors de la création de la date et heure du vol.");
            }

            try {
            System.out.println("Entrez la durée du vol (HH:mm) : ");
            String timeInput = scanner.nextLine();
            dfly = LocalTime.parse(timeInput);
            dEnd = dateTime.plusHours(dfly.getHour()).plusMinutes(dfly.getMinute());
                
            } catch (DateTimeParseException e) {
                System.out.println("Erreur.");
            }

            try {

                System.out.print("Entrez le nombre de sièges disponibles : ");
                seat = scanner.nextInt();
                if(seat < 80 && seat > 200) {
                    System.out.println("Le nombre de sièges doit être compris entre 80 et 200.");
                } else if (seat < 100) {
                    mult += 0.1f;
                } else if (seat >= 150) {
                    mult -= 0.1f;
                }
            } catch (Exception e) {
                System.out.println("Erreur lors de la saisie du nombre de sièges.");
            }
            
            try {

                price *= mult;
                
            } catch (Exception e) {
                System.out.println("Erreur lors du calcul du prix.");
            }
                 
         
            
            System.out.print("Voulez-vous ajouter un autre vol ? (true/false) : ");
            try{
            add = scanner.nextBoolean();
            } catch (Exception e) {
                System.out.println("Erreur lors de la saisie de la confirmation.");
                add = false; 
            }

            Fly += "Vol numéro " + i + "\nDépart : " + Start + " " + dateTime.format(DateTimeFormatter.ofPattern(" dd/MM/yyyy HH:mm")) + "\nArrivée : " + End + " " + dEnd.format(DateTimeFormatter.ofPattern(" dd/MM/yyyy HH:mm")) + "\nPrix : " + price + " euros\nSièges disponibles : " + seat + "\n\n";
        }

        System.out.println(Fly);

        scanner.close();

    }
}
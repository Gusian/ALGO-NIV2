import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


public class JalonAppV2{

 



    public static void main(String[]args) {
        String message;
        
        String Start="";
        String End="";
        Scanner clavier = new Scanner(System.in);
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
        String mdp="fly";
        String vmdp;
        int i=0;

        ArrayList<String> StartList = new ArrayList<>();
        ArrayList<String> EndList = new ArrayList<>();
        ArrayList<LocalDateTime> dstartList = new ArrayList<>();
        ArrayList<LocalDateTime> dendlist = new ArrayList<>();
        ArrayList<Float> priceList = new ArrayList<>();
        ArrayList<Integer> seatList = new ArrayList<>();

        System.out.println("Saisir votre mot de passe :");
        vmdp=clavier.nextLine();

        while (!vmdp.equals(mdp)&&i<2) {
            i++;
            System.out.println("Mot de passe incorrect, "+(3-i)+" essais restants.\n Saisir votre mot de passe à nouveau:");
            vmdp = clavier.nextLine();
        }

        if (i==2&&!vmdp.equals(mdp)){
            System.out.println("Votre compte est bloqué !");   
        }else{
        System.out.println("Vous êtes connecté !\nBienvenue dans l'application de gestion des vols !\nVeuillez entrer les informations des vols suivants :");
        }

        while (add) {
            message="Entrez le prix du vol : ";
            price= Methods.lireFloat(clavier, message);
            

            message="Entrez la ville et Pays de départ du vol :";
            Start= Methods.lireString(clavier, message);
            StartList.add(Start);

            message="Entrez la ville et Pays d'arrivée du vol :";
            End= Methods.lireString(clavier, message);
            EndList.add(End);

            date = Methods.lireDate(clavier, "Entrez la date du vol au format (dd MM yyyy) : ", formatter);
           
            if (date.isBefore(now.plusDays(7))) {
            mult += 0.4f;
            } else if (date.isAfter(now.plusDays(152))) {
            mult -= 0.4f;
            }

            time= Methods.lireTime (clavier, "Entrez l'heure du vol (format: HH:mm) : ", DateTimeFormatter.ofPattern("HH:mm"));

            dateTime = LocalDateTime.of(date, time);
            dstartList.add(dateTime);
           
            dfly = Methods.lireTime(clavier, "Entrez la durée du vol (HH:mm) : ", DateTimeFormatter.ofPattern("HH:mm"));
            dEnd = dateTime.plusHours(dfly.getHour()).plusMinutes(dfly.getMinute());
            dendlist.add(dEnd);
                
            do {
                seat = Methods.lireInt(clavier, "Entrez le nombre de sièges disponibles (entre 80 et 200) : ");
            } while (seat < 80 || seat > 200);
                
                 
                if (seat < 100) {
                    mult += 0.1f;
                } else if (seat >= 150) {
                    mult -= 0.1f;
                }
                seatList.add(seat);
                
                price *= mult;
                price = (float) Math.round(price * 100) / 100; 
                priceList.add(price);

                boolean response = true;

                add= Methods.lireBoolean(clavier,response, "Souhaitez-vous ajouter un autre vol ? (true/false) : ");   
        }

        for (i=0;i<StartList.size();i++) {
            System.out.println("Vol numéro " + (i+1) + ":");
            System.out.println("Départ : " + StartList.get(i) + " " + dstartList.get(i).format(DateTimeFormatter.ofPattern(" dd/MM/yyyy HH:mm")));
            System.out.println("Arrivée : " + EndList.get(i) + " " + dendlist.get(i).format(DateTimeFormatter.ofPattern(" dd/MM/yyyy HH:mm")));
            System.out.println("Prix : " + priceList.get(i) + " euros");
            System.out.println("Sièges disponibles : " + seatList.get(i));
            System.out.println();
        }

        clavier.close();
    }
}
    

  
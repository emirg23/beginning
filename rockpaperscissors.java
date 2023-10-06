import java.util.Scanner;
import java.util.Random;

public class rockpaperscissors {
/**
 * @param Args
 */
public static void main(String[] Args) {

Scanner input = new Scanner(System.in);

Random random = new Random();

System.out.println("ROCK PAPER SCISSORS BY EMIRG");

System.out.println("Hello, would you like to play rock paper scissors against the computer?");

String cevap = input.nextLine();

cevap = cevap.toLowerCase();

if (cevap.equals("no")) {
    System.out.println("have a great day then.");
    System.exit(0);
}
else if ("no.".equals(cevap)) {
    System.out.println("have a great day then.");
    System.exit(0);
}

int pcsvictories = 0;

int playersvictories = 0;

int a = 0;


while (pcsvictories < 3 && playersvictories < 3) {

    

    System.out.println("please choose an option between Rock/Paper/Scissors");    

    
    String oyuncununsecenegi = input.nextLine();
    
    oyuncununsecenegi = oyuncununsecenegi.toLowerCase();
    
    
        
        while (a == 0) {
            
            if (oyuncununsecenegi.equals("rock") || oyuncununsecenegi.equals("paper") || oyuncununsecenegi.equals("scissors")) {
                a = 1;
        }
            
            else {
                
                System.out.println("what you wrote as a value is not valid, please try again.");

                oyuncununsecenegi = input.nextLine();
                
                oyuncununsecenegi = oyuncununsecenegi.toLowerCase();

            } } 
    

        

        int pcninsecenegi = random.nextInt((3 - 1) + 1) + 1;

        if (pcninsecenegi == 1) {
            System.out.println("computer's choice = rock");
            if (oyuncununsecenegi.equals("rock")) {
                System.out.println("this round is draw."); }
            
            else if (oyuncununsecenegi.equals("paper")) {
                System.out.println("the player won.");
                playersvictories = playersvictories + 1;
            }
            else if (oyuncununsecenegi.equals("scissors")) { 
                System.out.println("the computer won.");
                pcsvictories = pcsvictories + 1;
            }

        } 

        else if (pcninsecenegi == 2) {
            System.out.println("computer's choice = paper");
            if (oyuncununsecenegi.equals("rock")) {
                System.out.println("the computer won.");
                pcsvictories = pcsvictories + 1; }
            else if (oyuncununsecenegi.equals("paper")) {
                System.out.println("this round is draw");
            }
            else if (oyuncununsecenegi.equals("scissors")) {
                System.out.println("the player won.");
                playersvictories = playersvictories + 1;
            }  
        }

        else if (pcninsecenegi == 3) {
            System.out.println("computer's choice = scissors");
            if (oyuncununsecenegi.equals("rock")) {
                System.out.println("the player won.");
                playersvictories = playersvictories + 1; }
            else if (oyuncununsecenegi.equals("paper")) {
                System.out.println("the computer won.");
                pcsvictories = pcsvictories + 1;    
            }
            else if (oyuncununsecenegi.equals("scissors")) {
                System.out.println("the round is draw.");
            }
        }
        System.out.println("playersvictories = " + playersvictories);
        System.out.println("pcsvictories = " + pcsvictories);

        



    }
    
    
    System.out.println("Game is over.");

    if(pcsvictories == 3) {
        System.out.println("computer won the game completely.");
    }
    else if (playersvictories == 3) {
        System.out.println("player won the game completely.");
    }


input.close();
    
    
} }
import java.util.Random;

import java.util.Scanner;

public class guessthenumber {
public static void main(String[] Args) {

Random random = new Random();

Scanner input = new Scanner(System.in);

int pcsnumber = random.nextInt((99 - 1) + 1) + 1;



System.out.println("Hello, would you like to guess what number i am thinking of right now?");

String answer = input.nextLine();

answer = answer.toLowerCase();

if (answer.equals("no")) {
    System.out.println("okay then, have a great day...");
    System.exit(0);
}

else if (answer.equals("no.")) {
    System.out.println("okay then, have a great day...");
    System.exit(0);
}

System.out.println("okay, now it's time to guess. let's see if you can. write a number");

int loop = 1;

while (loop == 1) {
int playersnumber = input.nextInt();

if (playersnumber > pcsnumber){
    System.out.println("The number you wrote is bigger. Try again."); }

else if(pcsnumber > playersnumber) {
    System.out.println("The number you wrote is less. Try again."); }

else if (pcsnumber == playersnumber) {
    System.out.println("You found the number!");
    System.out.println("You won.");
    loop = 0;
}
}


input.close();
    }
}

import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        char t = 'y';
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 for Rock.\nEnter 2 for Paper.\nEnter 3 for Scissor.");
            int userInput = sc.nextInt();

            Random random = new Random();
            int computerInput = random.nextInt(3);

            if (userInput > 3) {
                System.out.println("Wrong Input");
                break;
            }
            else if(userInput == computerInput) {
                System.out.println("Game Draw");
            } else if (userInput == 1 && computerInput == 3 || userInput == 2 && computerInput == 1 ||
                    userInput == 3 && computerInput == 2) {
                System.out.println("Yeah You Win! ");
            } else {
                System.out.println("Computer Win!");
            }
            if (computerInput == 1) {
                System.out.println("Computer Choice: Rock");
            } else if (computerInput == 2) {
                System.out.println("Computer Choice: Paper");
            } else if (computerInput == 3) {
                System.out.println("Computer Choice: Scissor");
            }
            System.out.println("If you want to play again press Y");
            t = sc.next().charAt(0);
        }while(t=='y');
    }
}
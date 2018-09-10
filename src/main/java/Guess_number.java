import java.util.Scanner;
import java.util.Random;

public class Guess_number {


    public static void random_guess(){

        Random rand = new Random();

        int answer=rand.nextInt(100);
        int guess=-1;
        Scanner reader=new Scanner(System.in);

        while(guess!=answer){
            System.out.println("Guess any  number between 1 - 100 ");
            guess=reader.nextInt();
            if(guess<answer){
                System.out.println(" Number guessed is less than original number");
            }
            else if( guess>answer){
                System.out.println("Number guessed is more than original number");
            }

            else{
                System.out.println("Number guessed matches the original number");
                break;
            }


        }
    }
}

import java.util.Scanner;

public class Second {


    public static void main(String args[]){

        Scanner reader=new Scanner(System.in);
        int number=reader.nextInt();
        if(number>20 && number < 30){
            if(number%2==0){
                System.out.println("Tom");
            }
            else{

                System.out.println("Jerry");
            }
        }

        else{
            System.out.println("No default action specified");
        }




    }

}

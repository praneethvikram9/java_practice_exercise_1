import java.util.Scanner;

public class Third {


    public static void main(String args[]){
        Scanner reader=new Scanner(System.in);
        String a ="";
        a=reader.nextLine();
        int len=a.length();
        int i=0;
        char temp;
        for(i=0;i<len;i++){
            temp=a.charAt(i);
            int asc = (int) temp;
            if((asc >= 65 && asc <=90) || ( asc >=97 && asc<=122)){
                if( asc==65||asc==69||asc==73||asc==79||asc==85||asc==97||asc==101||asc==105||asc==111||asc==117){
                    System.out.println("Vowel ");

                }
                else{
                    System.out.println("Consonant");
                }


            }

            else{

                System.out.println("Please enter only letters");
            }



        }





    }
}

import java.util.Scanner;

public class Sixth {

    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        String a="";
        a=reader.next();
        int len=a.length();
        char temp;
        int asc=0;
        int i;
        for(i=0;i<len;i++){
            temp=a.charAt(i);
            asc = (int) temp;

        }


        if(asc>=65 && asc<=90){
            System.out.println("Capital letter");
        }
        else if(asc>=97 && asc<=122){
            System.out.print("Lower case");
        }
        else if(asc>=48 && asc<=57){
            System.out.print("a digit");
        }
        else{
            System.out.print("Special symbol");
        }
    }
}

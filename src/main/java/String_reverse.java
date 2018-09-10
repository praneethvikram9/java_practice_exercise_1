package main.java;

import java.util.Scanner;

public class String_reverse {

    public static void main(){

        Scanner reader = new Scanner(System.in);
        String  str = reader.nextLine();
        int length=str.length();
        int i;
        String answer="";
        for(i=length-1;i>=0;i--){
            answer=answer+str.charAt(i);
        }

        System.out.println(answer);

    }
}

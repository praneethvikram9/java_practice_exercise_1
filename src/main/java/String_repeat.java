package main.java;

import java.util.Scanner;
import java.lang.*;
public class String_repeat {

    public static void main(){

        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        int number ;
        number=reader.nextInt();
        int length=str.length();
        int extra_length=length-number;
        String ans="";
        String result="";
        int i;
        for(i=length-1;i>=extra_length;i--){

            ans=ans+str.charAt(i);
        }

        for(i=0;i<number;i++) {

            str=str + ans;


        }

         System.out.println(str);



    }
}

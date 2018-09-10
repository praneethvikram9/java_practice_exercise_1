package main.java;

import java.util.Scanner;


 class Palindrome

 {
     public static String check_palindrome(long number)
     {
         long temp=number;
         long sum=0;
         long t=0;
         long sum_even=0;
         while(temp>0){
             t=temp%10;
             if(t%2==0){
                 sum_even=sum_even+t;
             }
             temp=temp/10;
             sum=sum * 10 + t;
         }
         if(number==sum) {
             if (sum_even > 25) {
                 return "it  is a palindrome and sum of even numbers is greater than 25";
             } else {
                 return " it is a palindrome and sum of even numbers is less than 25";
             }
         }
         else{
             return " it is not a palindrome";
         }
     }





}

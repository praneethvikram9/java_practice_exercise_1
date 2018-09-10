import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays.*;
import java.util.Collections;



public class Sorting_digits {

    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        int number;
        number=reader.nextInt();
        int length=0;
        int temp=number;
        int variable;
        while(temp>0){

            temp=temp/10;
            length++;

        }
        int a[] = new int[length];

        temp=number;
        int i=0;
        while(temp>0){
            variable=temp%10;
            a[i]=variable;
            i++;
            temp=temp/10;

        }
        for(i=0;i<length;i++){
            a[i]=a[i]*-1;
        }

        Arrays.sort(a);

        for(i=0;i<length;i++){
            a[i]=a[i]*-1;
        }


        for(i=0;i<length;i++){

            System.out.print(a[i]);
        }




    }
}

import java.util.Scanner;

public class Fifth {
    public static void main(String args[]) {


        Scanner reader = new Scanner(System.in);
        int i;
        String a = "";
        int sum=0;
        a = reader.nextLine();
        String[] temp= a.split(" ");
        int [] num=new int[temp.length];
        for(i=0;i<temp.length;i++){

            num[i]=Integer.parseInt(temp[i]);
        }

        for(i=0;i<temp.length;i++){
            sum=sum+num[i];
        }

        System.out.println(sum);





    }
}
package main.java;

import java.util.Scanner;

public class Check_ascii {




    public static String check_character(String a) {

        int i;
        int len = a.length();
        char temp;
        String answer="";
        for (i = 0; i < len; i++) {
            temp = a.charAt(i);
            int asc = (int) temp;
            if ((asc >= 65 && asc <= 90) || (asc >= 97 && asc <= 122)) {
                if (asc == 65 || asc == 69 || asc == 73 || asc == 79 || asc == 85 || asc == 97 || asc == 101 || asc == 105 || asc == 111 || asc == 117) {
                    answer=answer + "Vowel";
                } else {
                    answer=answer+ "Consonant";
                }
            } else {
                return "Error ";
            }
        }

        return answer;
    }

}

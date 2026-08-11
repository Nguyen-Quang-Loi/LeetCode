package LeetCode;

import java.util.Scanner;

public class StringToInt {
    public static String chuyen (String a){
        String luu = "";
        for (int i = 0; i < a.length(); i++ ){

           if(a.charAt(i)==' '){
            i++;
           }

           else if (a.charAt(i)=='-' || a.charAt(i)=='+'){
            luu+=a.charAt(i);

           }
         
           else if( Character.isDigit(a.charAt(i))){
            luu+=a.charAt(i);
           }
        }
        int n = Integer.parseInt(luu);
        return luu;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter string : ");
        String n = sc.nextLine();

        System.out.println(chuyen(n));

    }
}

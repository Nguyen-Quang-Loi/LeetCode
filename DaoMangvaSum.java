package LeetCode;

import java.util.Scanner;

public class DaoMangvaSum {
    public static void Dao (int[] arr) {
        int left=0;
        int ringht = arr.length - 1;                                                  
        while(left< ringht){
            int temp = arr[left];
            arr[left]= arr[ringht];
            arr[ringht] = temp;

            left++;
            ringht--;
        }
    }
    public static int arrtoint (int[] arr){
        int resuil = 0;
        int temp = 0;
        while (temp < arr.length ) {
            resuil = resuil*10 + arr[temp];
            temp++;
        }
        return resuil;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("nhập só : ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < a.length; i++){
            a[i]= sc.nextInt();
        }

        Dao(a);
        for(int i =0; i<n;i++){
            System.out.print(a[i] + " ");
        }

        System.out.println();

        System.out.println(arrtoint(a));

    }

}

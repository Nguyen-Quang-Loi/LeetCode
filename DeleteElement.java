package LeetCode;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteElement {
    public static void Deleteelement(ArrayList<Integer> arr, int n){
        for(int i =0; i < arr.size(); i++){
            if(arr.get(i) == n){
                arr.remove(i);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input array size : ");
        int c = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < c; i++){
            arr.add(sc.nextInt());
        }

        System.out.print("Enter the number to delete : ");
        int n = sc.nextInt(); 
        
        Deleteelement(arr, n);

        System.out.print("new Array: ");
        System.out.print(arr);
        
    }
}

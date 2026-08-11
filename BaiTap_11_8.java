package LeetCode;
import java.util.Scanner;

public class BaiTap_11_8 {
    public static int gt(int n) {
        int temp = 1;
        for (int i = 1; i <= n; i++) {
            temp *= i;
        }
        return temp;
    }

    public static void kt(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " La so chan");
        } else {
            System.out.println(n + " khong phai la so chan");
        }

    }

    public static int[] slectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i + 1;
            for (int j = i + 1; i < n; i++) {
                if (arr[i] < arr[min]) {
                    min = j;
                }
            }
        }
        return arr;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------- Menu-------");
        System.out.println("1. Tim giay thua");
        System.out.println("2. tim Insertion sort");
        System.out.print("Nhap so de tim :");
        int nt = sc.nextInt();
        
        switch (nt) {
            case 1:
                System.out.print("Nhap giay thua : ");
                int n = sc.nextInt();
                System.out.println(n + " giay thua la : " + gt(n));
                kt(gt(n));
                break;
            case 2:
                System.out.println("Nhap kich co : ");
                int nn =sc.nextInt();
                int[] arr = new int[nn];
                for(int i = 0; i < arr.length; i++){
                    arr[i] = sc.nextInt();
                }
                slectionSort(arr);

                System.out.println();

                System.out.println("Mang duoc xap xep : ");
                for (int i = 0; i < arr.length;i++){
                    System.out.print(i + " ");
                }
                
                break;

            default:
                System.out.println("Nhap dang hoan ");
                break;
        }
    }

}
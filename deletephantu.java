package LeetCode;
import java.util.Scanner;

public class deletephantu {
    public static int removeElement(int[] nums, int val) {
        int k = 0;  

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng phần tử
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Nhập các phần tử của mảng
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Nhập giá trị cần xóa
        System.out.print("Nhập giá trị cần xóa: ");
        int val = sc.nextInt();

        // Gọi hàm
        int newLength = removeElement(nums, val);

        // In kết quả
        System.out.println("Độ dài mới: " + newLength);

        System.out.print("Mảng sau khi xóa: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    
}
}

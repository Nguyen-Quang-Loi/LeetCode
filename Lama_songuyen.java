package LeetCode;
import java.util.Scanner;
public class Lama_songuyen {


    public static int getValue(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;
        return 0;
    }

    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            int current = getValue(s.charAt(i));
            int next = getValue(s.charAt(i + 1));

            if (current < next) {
                result -= current;
            } else {
                result += current;
            }
        }

        result += getValue(s.charAt(s.length() - 1));

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số La Mã: ");
        String roman = sc.nextLine().toUpperCase();

        int number = romanToInt(roman);

        System.out.println("Số nguyên = " + number);
    }
}


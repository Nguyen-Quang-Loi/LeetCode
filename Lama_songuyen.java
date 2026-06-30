package LeetCode;
import java.util.Scanner;
public class Lama_songuyen {


    public static int getValue(char c) {
       switch (c) {
        case 'I': return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        case 'M': return 1000;
            
        default:
            return -1;
       }
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


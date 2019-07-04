//打印一个数从1到n位最大的数。

import java.util.Scanner;

public class Main {
    public static void main(String[] argc) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printOneToNMax(n);
    }

    public static void printOneToNMax(int n) {
        char[] number = new char[n];
        for(int i=0;i<number.length;i++){
            number[i]='0';
        }
        while (!increase(number)) {
            printNumber(number);
        }
    }

    public static boolean increase(char[] number) {
        int length = number.length;
        int carry = 0;
        boolean overFlow = false;
        for (int i = length - 1; i >= 0; i--) {
            int sum = 0;
            if (i == length - 1) {
                sum++;
            }
            sum = sum + number[i] - '0' + carry;
            if (sum >= 10) {
                if (i == 0) {
                    overFlow = true;
                } else {
                    carry = 1;
                    number[i] = (char) (sum - 10 + '0');
                }
            } else {
                number[i] = (char) (sum + '0');
                break;
            }
        }
        return overFlow;
    }

    public static void printNumber(char[] number) {
        int length=number.length;
        int begin=0;
        while(number[begin]=='0'){
            begin++;
        }
        for(int i=begin;i<length;i++){
            System.out.print(number[i]);
        }
        System.out.println();
    }
}

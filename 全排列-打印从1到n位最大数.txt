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
        handleOneToNMax(number,n,0);
    }

    public static void handleOneToNMax(char[] number,int n,int index) {
        if(index==n){
            printNumber(number);
            return;
        }

        for(int i=0;i<10;i++){
            number[index]= (char) (i+'0');
            handleOneToNMax(number,n,index+1);
        }
    }

    public static void printNumber(char[] number) {
        int length=number.length;
        int begin=0;
        while(begin<length&&number[begin]=='0'){
            begin++;
        }
        for(int i=begin;i<length;i++){
            System.out.print(number[i]);
        }
        System.out.println();
    }
}

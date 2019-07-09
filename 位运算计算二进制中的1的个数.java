题目：请实现一个函数，输入一个数，输出该数中二进制中1的个数。例如2的二进制是10，结果为1.
import java.util.Scanner;

public class Main {
    public static void main(String[] argc){
        Scanner in=new Scanner(System.in);
        Main main=new Main();
        int n=in.nextInt();
        System.out.print(main.findBinaryOneTimes(n));
    }

    private int findBinaryOneTimes(int n){
        int res=0;
        while(n!=0){
            res++;
            n=n&(n-1);
        }
        return res;
    }

}

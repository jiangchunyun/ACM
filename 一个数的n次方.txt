//计算一个数的n次方
import java.util.Scanner;

public class Main {
    public static void main(String[] argc){
        Scanner in=new Scanner(System.in);
        Main main=new Main();
        int base=in.nextInt();
        int power=in.nextInt();
        System.out.print(main.calBasePower(base,power));
    }

    private int calBasePower(int base , int power){
        if(power==0){
            return 1;
        }

        if(power==1){
            return base;
        }

        int res=calBasePower(base,power>>1);
        res=res*res;
        if((power&0x1)==1){
            res=res*base;
        }
        return res;
    }
}

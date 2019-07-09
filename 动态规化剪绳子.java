import java.util.Scanner;

public class Main {
    public static void main(String[] argc){
        Scanner in=new Scanner(System.in);
        Main main=new Main();
        int n=in.nextInt();
        System.out.print(main.cropMax(n));
    }

    private int cropMax(int n){
        if(n<2){
            return 0;
        }else if(n==2){
            return 1;
        }else if(n==3){
            return 2;
        }
        int[] max=new int[n+1];
        max[0]=0;
        max[1]=1;
        max[2]=2;
        max[3]=3;
        int res;
        for(int i=4;i<=n;i++){
            res=0;
            for(int j=0;j<=i/2;j++){
                if(res<max[j]*max[i-j]){
                    res=max[j]*max[i-j];
                }
            }
            max[i]=res;
        }
        return max[n];
    }

}

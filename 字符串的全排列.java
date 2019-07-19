//字符串的全排列，例如abc 的全排列：abc acb bac bca cab cba

import java.util.Scanner;

public class Main {
    public static boolean[] sign=new boolean[1000];
    public static void main(String[] argc) {
        Scanner in = new Scanner(System.in);
        String str=in.next();
        StringBuilder stringBuilder=new StringBuilder();
        stringAragnge(str,stringBuilder);
    }
    public static void stringAragnge(String str,StringBuilder res){
        if(res.length()>=str.length()){
            System.out.println(res);
        }

        for(int i= 0;i<str.length();i++){
            if(!sign[i]){
                sign[i]=true;
                res=res.append(str.charAt(i));
                stringAragnge(str,res);
                sign[i]=false;
                res.deleteCharAt(res.length()-1);
            }
        }
    }
}

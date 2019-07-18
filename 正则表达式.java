//正则字符串匹配 例如：AAA 与 A.A 匹配 aa

import java.util.Scanner;

public class Main {
    public static void main(String[] argc) {
        Scanner in = new Scanner(System.in);
        String str=in.next();
        String p=in.next();
        System.out.println(isMatch(str,p));
    }

    public static boolean isMatch(String str,String p){
        if(str.length()==0 && p.length()==0){
            return true;
        }
        if(str.length()==0&&p.length()!=0){
            return false;
        }
        if(str.length()!=0&&p.length()==0){
            return false;
        }

        if(p.length()>1&&p.charAt(1)=='*'){
            if(str.charAt(0)==p.charAt(0)||(p.charAt(0)=='.'&&str!=null)){
                return isMatch(str.substring(1,str.length()),p.substring(2,p.length()))||
                        isMatch(str.substring(1,str.length()),p)||
                        isMatch(str,p.substring(2,p.length()));
            }
        }

        if(str.charAt(0)==p.charAt(0)||(p.charAt(0)=='.'&&str!=null)){
            return isMatch(str.substring(1,str.length()),p.substring(1,p.length()));
        }
        return false;
    }
}

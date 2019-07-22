//判断一个字符串是不是一个数值

import java.util.Scanner;

public class Main {
    public static Integer index= new Integer(0);
    public static void main(String[] argc) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(isNumber(str));
    }

    public static boolean isNumber(String str) {
        if (str.length() <= 0)
            return false;
        boolean number=scanNumber(str,index);
        System.out.println(index);
        if(str.charAt(index)=='.'){
            index++;
            number=unsignNumber(str,index)||number;
        }
        if(str.charAt(index)=='e'||str.charAt(index)=='E'){
            index++;
            number=number&&scanNumber(str,index);
        }
        return number&&index==(str.length());
    }

    public static boolean unsignNumber(String str, Integer index) {
        Integer start = index;
        for (; index < str.length(); index++) {
            if (str.charAt(index) >= '0' && str.charAt(index) <= '9') {
            } else {
                break;
            }
        }
        return start != index;
    }

    public static boolean scanNumber(String str, Integer index) {
        if (str.charAt(index) == '+' || str.charAt(index) == '-') {
            index++;
        }
        return unsignNumber(str, index);
    }


}

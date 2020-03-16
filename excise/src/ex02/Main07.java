package ex02;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal b = new BigDecimal(0);
        int flag  = 0;
        String s = sc.next();
        while(true){
            if(s.equals("e")||s.equals("E")){
                break;
            }
            flag = 1;
            BigDecimal b1 = new BigDecimal(s);
            b=b.add(b1);
            s = sc.next();
        }
        if (flag == 1){
            System.out.println(b);
        }
    }
}
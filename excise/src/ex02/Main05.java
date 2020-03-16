package ex02;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            BigDecimal b1 = new BigDecimal(sc.next());
            BigDecimal b2 = new BigDecimal(sc.next());
            System.out.println(b1.add(b2).toString());
            System.out.println(b1.multiply(b2).toString());
        }
    }
}
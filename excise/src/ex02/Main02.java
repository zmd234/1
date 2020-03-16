package ex02;

import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasNextLine()){
            int n = sc.nextInt();
            int begain = sc.nextInt();
            int end = sc.nextInt();
            for (int i = 0; i < n; i++) {
                sb.append(i);
            }
            String s = sb.toString();
            System.out.println(s.substring(begain,end));
        }
    }
}
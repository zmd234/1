package ex02;

import java.util.Scanner;

public class Main09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ji = 0;
        int ou = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if(num%2==0){
                ou = ou + num;
            }else{
                ji = ji + num;
            }
        }
        sc.nextLine();
        sc.close();
        System.out.println("奇数和="+ji+","+"偶数和="+ou);
    }
}
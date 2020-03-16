package day07;

import com.sun.security.jgss.GSSUtil;

import java.util.Random;
import java.util.Scanner;

public class Demo05 {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int num = r.nextInt(100) + 1;
        int  i = 0;
        while(i<=10){
            int num1 = sc.nextInt();
            if(num1==num){
                System.out.println("恭喜你，猜中了");
                break;
            }else if (num1>num){
                System.out.println("太大了");
            }else {
                System.out.println("太小了");
            }
            i++;
        }
        if (i>10){
            System.out.println("很遗憾，机会用光了！！！");
        }
    }
}

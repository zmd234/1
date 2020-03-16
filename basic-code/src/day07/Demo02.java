package day07;

import java.util.Scanner;

public class Demo02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first:");
        int num1 = sc.nextInt();
        System.out.println("second:");
        int num2 = sc.nextInt();
        System.out.println("third:");
        int num3 = sc.nextInt();
        int temp = num1 > num2 ? num1 : num2;
        int max = temp > num3 ? temp : num3;
        System.out.println("最大值是："+max);
    }
}

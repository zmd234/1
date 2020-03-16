package exercise;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        double num2 = sc.nextDouble();
        System.out.println(num1+num2);
        System.out.println(Math.sqrt(num1+num2));
        String str = String.valueOf(Math.sqrt(num1+num2));
        char[] c = str.toCharArray();
        for (int i = 0; i <6 ; i++) {
            System.out.print(c[i]);
        }

    }
}

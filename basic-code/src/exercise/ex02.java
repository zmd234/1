package exercise;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (sc.hasNext()) {
            int sum = 0;
            String sent = sc.nextLine();
             num = Integer.parseInt(sent);
            if (num >= 10000 && num <= 20000) {
                System.out.println(Integer.toBinaryString(num)+","+Integer.toOctalString(num)+","+Integer.toHexString(num));;
            } else {
                char[] c = sent.toCharArray();
                if (num >= 0) {

                    for (int i = 0; i < c.length; i++) {
                        int number = c[i] - '0';
                        sum += number;
                        System.out.print(number + " ");
                    }
                } else {

                    for (int i = 1; i < c.length; i++) {
                        int number = c[i] - '0';
                        sum += number;
                        System.out.print(number + " ");
                    }
                }
                System.out.println(sum);
            }
        }
        sc.close();
    }
}

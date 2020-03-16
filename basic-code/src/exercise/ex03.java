package exercise;

import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            boolean b = true;
            int sum = 0;
            String line = sc.nextLine();
            char[] c = line.toCharArray();
            for (int i = 0; i <c.length; i++) {
                if(Character.isDigit(c[i])){
                    int num = c[i] - '0';
                    sum += num;
                }
            }
            System.out.println(sum);
        }
    }
}

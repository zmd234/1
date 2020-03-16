package ex02;

import java.util.Arrays;
import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            sc.nextLine();
            String[][] str = new String[num][];
            for (int i = 0; i < num; i++) {
                str[i] = new String[i + 1];
                for (int j = 0; j < i + 1; j++) {
                    str[i][j] = (i + 1) + "*" + (j + 1) + "=" + ((i + 1) * (j + 1));
                    if (j < i) {
                        System.out.printf("%-7s", str[i][j]);
                    } else {
                        System.out.printf("%s", str[i][j]);
                    }
                }
                System.out.println();
            }
            System.out.println(Arrays.deepToString(str));
        }
    }
}
package ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = sc.next();
            if (s.equals("end")) {
                break;
            } else if (s.length() % 3 == 0) {
                list.add(s);
            }
        }
        sc.nextLine();
        sc.close();
        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j) + " ");
        }
    }
}
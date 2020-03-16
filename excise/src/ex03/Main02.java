package ex03;

import java.util.Scanner;


public class Main02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] per = new Person[n];
        for (int i = 0; i < n; i++) {
            per[i] = new Person(sc.next(), sc.nextInt(), sc.nextBoolean());
            System.out.println("This is initialization block, id is " + i);
        }
        sc.close();
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(per[i].toString());
        }
        Person p = new Person();
    }

}

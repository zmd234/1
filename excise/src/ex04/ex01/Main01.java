package ex04.ex01;

import java.util.Arrays;
import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PersonSortable2[] person  = new PersonSortable2[n];
        for (int i = 0; i < n; i++) {
            person[i] = new PersonSortable2(sc.next(),sc.nextInt());
        }
        sc.close();
        Arrays.sort(person,new NameComparator());
        System.out.println("NameComparator:sort");
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
        Arrays.sort(person,new AgeComparator());
        System.out.println("AgeComparator:sort");
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
        System.out.println(Arrays.toString(NameComparator.class.getInterfaces()));
        System.out.println(Arrays.toString(AgeComparator.class.getInterfaces()));

    }
}

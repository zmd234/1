package ex04.ex02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayIntegerStack array = new ArrayIntegerStack(n);
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            System.out.println(array.push(sc.nextInt()));
        }
        System.out.println(array.peek()+","+array.empty()+","+array.size());
        String arr=array.toString();
        System.out.println(array.toString());
        int l = sc.nextInt();
        for (int i = 0; i < l; i++) {
            System.out.println(array.pop());
        }
        System.out.println(array.peek()+","+array.empty()+","+array.size());
        System.out.println(arr.toString());
    }
}

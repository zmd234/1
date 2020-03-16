package ex03.ex03_04;


import java.util.Arrays;
import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // sc.nextLine();
        Shape[] sh = new  Shape[n];
        int j = 0, k = 0;
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            if (str.equals("rect")) {
                sh[i] = new Rectangle(sc.nextInt(), sc.nextInt());
            } else if (str.equals("cir")) {
                sh[i] = new Circle(sc.nextInt());
            }
            sc.nextLine();
        }
        System.out.println(sumAllPerimeter(n,sh));
        System.out.println(sumAllArea(n,sh));
        System.out.println(Arrays.toString(sh));
        for (int i = 0; i < n; i++) {
            if(sh[i] instanceof Rectangle) {
                System.out.println("class Rectangle,class Shape");
            }else {
                System.out.println("class Circle,class Shape");

            }

        }
    }

    public static double sumAllArea(int n,Shape shape[]) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += shape[i].getArea();
        }
        return sum;
    }

    public static double sumAllPerimeter(int n,Shape shape[]) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=shape[i].getPerimeter();
        }
        return sum;
    }
}

package ex03;


import ex03.Circle;
import ex03.Rectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle[] rec = new Rectangle[2];
        Circle[] cir = new Circle[2];
        for (int i = 0; i < 2; i++) {
            rec[i] = new Rectangle(sc.nextInt(), sc.nextInt());
        }
        for (int i = 0; i < 2; i++) {
            cir[i] = new Circle(sc.nextInt());
        }
        int sum_perimeter = 0;
        int sum_area = 0;
        for (int i = 0; i < 2; i++) {
            sum_perimeter += rec[i].getPerimeter();
            sum_area += rec[i].getArea();
            sum_perimeter += cir[i].getPerimeter();
            sum_area += cir[i].getArea();
        }
        System.out.println(sum_perimeter);
        System.out.println(sum_area);
        //System.out.print(rec[0].toString() + ", " + rec[1].toString());
        //System.out.println();
        //System.out.print(cir[0].toString() + ", " + cir[1].toString());
        System.out.println(Arrays.deepToString(rec));
        System.out.println(Arrays.deepToString(cir));
    }
}

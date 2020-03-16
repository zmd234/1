package ex04.ex03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] d = new double[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextDouble();
        }
        System.out.println(ArrayUtils.findMinMax(d).toString());
        System.out.println(ArrayUtils.PairResult.class);
    }
}

package ex02;

import java.util.Arrays;
import java.util.Scanner;



public class Main11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        double[][] d = new double[n][];
        for (int i = 0; i < n; i++) {
            d[i] = new double[n+1];
            for (int j = 0; j < n+1; j++) {
                d[i][j] = sc.nextDouble();
            }
        }
        sc.nextLine();
        sc.close();
        System.out.println(Arrays.deepToString(d));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n+1; j++) {
                if (j<n-1){
                    System.out.print(d[i][j]+", ");
                }else if (j==n-1){
                    System.out.print(d[i][j]+" = ");
                }else{
                    System.out.println(d[i][j]);
                }
            }
        }
    }
}
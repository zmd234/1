package exercise;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){
            double item = 0;
            double num = sc.nextDouble();
            if(num<0){
                System.out.println("Double.NaN");
            }else{
                while((item*item<num)&&(Math.abs(num - item*item)>0.0001D)){
                    item = item + 0.0001D;
                }
                System.out.println(String.format("%.6f",item));
            }
        }
    }
}

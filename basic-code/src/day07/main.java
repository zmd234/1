package day07;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        String num ;
        while (sc1.hasNext()){
            int num1 = sc1.nextInt();
            int num2 = sc1.nextInt();
            if(num1<0&&(num1*-1)>1000||num1>1000){
                System.out.println("|a|>1000");
            }else{
                System.out.println(num1+num2);
            }
        }
        sc1.close();
    }
}

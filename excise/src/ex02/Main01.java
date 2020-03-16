package ex02;


import java.util.Arrays;
import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[1];
        while (sc.hasNextLine()) {
            String str = sc.nextLine();

            if (str.equals("fib")) {
                int n = Integer.valueOf(sc.nextLine());
                int d=1,b=1,sum=1;
                for (int i = 1; i <= n; i++) {
                    if(i==1){
                        System.out.printf("%d",1);
                    }else{
                        System.out.printf(" %d",sum);
                        sum = d + b;
                        d = b;
                        b = sum;
                    }
                }
                System.out.println();
            } else if (str.equals("sort")) {
                String s[] = sc.nextLine().split(" ");
                a = new int[s.length];
                for (int i = 0; i < s.length; i++) {
                    a[i] = Integer.valueOf(s[i]);
                }
                Arrays.sort(a);
                System.out.println(Arrays.toString(a));
            } else if (str.equals("search")) {
                int  b=Integer.valueOf(sc.nextLine());
                int flag=0;
                for (int i =0;i<a.length;i++){
                    if (a[i]==b){
                        flag=1;
                        System.out.println(i);
                        break;
                    }
                }
                if (flag==0){
                    System.out.println(-1);
                }
            } else if (str.equals("getBirthDate")) {
                int num = Integer.valueOf(sc.nextLine());
                for (int i = 0; i < num; i++) {
                    String birth = sc.nextLine();
                    System.out.println(birth.substring(6, 10) + "-" + birth.substring(10, 12) + "-" + birth.substring(12, 14));
                }
            } else {
                System.out.println("exit");
            }
        }
    }
}
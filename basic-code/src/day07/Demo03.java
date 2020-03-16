package day07;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Demo03 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i <10 ; i++) {
            int num = r.nextInt();
            System.out.println(num);
        }
    }

}

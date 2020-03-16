package day07;

import java.util.Random;

public class Demo04 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i <20 ; i++) {
            System.out.println(r.nextInt(20)+1);
        }
    }
}

package day06;

import java.util.Arrays;

/*
 *面向过程：
 *面向对象：当需要实现一个功能的时候，不关心具体的步骤，而是找一个已经具有该功能的人，来帮我做事。
 */
public class Demo01 {

    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4};

        for (int i = 0; i <arrayA.length ; i++) {
            if(i<arrayA.length-1){
                System.out.print(arrayA[i] + ",");
            }else{
                System.out.println(arrayA[i]);
            }
        }

        System.out.println(Arrays.toString(arrayA));
    }
}

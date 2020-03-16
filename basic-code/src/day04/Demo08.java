package day04;

public class Demo08 {

    public static void main(String[] args) {
        int[] arrayA = new int[3];
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("----------------------");

        arrayA [0] = 12;
        arrayA [1] = 13;
        arrayA [2] = 14;
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("------------------");

        int[] arrayB = arrayA;
        arrayB[0] = 20;
        arrayB[1] = 30;
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);
        System.out.println("------------------");
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("------------------");
    }
}

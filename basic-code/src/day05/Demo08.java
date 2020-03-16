package day05;

public class Demo08 {

    public static void main(String[] args) {

        int[] array =  sum(10,20);
        System.out.println(array[1]);
    }

    public static int[] sum(int a, int b) {
        int sum = a + b;
        int avg = (a + b) / 2;
        int[] array = {sum, avg};
        return array;
    }
}

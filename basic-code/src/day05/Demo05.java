package day05;

public class Demo05 {
    public static void main(String[] args) {

        int[] array = new int[]{10, 20, 30, 40, 3000};
        int max = array[0];
        for (int i = 1; i < 5; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}

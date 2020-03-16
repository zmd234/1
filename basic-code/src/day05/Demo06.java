package day05;

public class Demo06 {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};
        for (int i = 0; i <= (array.length-1)/2; i++) {
                int item;
                item = array[i];
                array[i] = array[array.length-1-i];
                array[array.length-1-i] = item;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

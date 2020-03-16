package day05;

public class Demo07 {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};
        print(array);
        for (int i = 0; i <= (array.length-1)/2; i++) {
            int item;
            item = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = item;
        }
        print(array);
        for (int i = 0; i <= (array.length-1)/2; i++) {
            int item;
            item = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = item;
        }
        print(array);
    }
    public  static  void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

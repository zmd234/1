package day03;

public class Demo04 {

    public static void main(String[] args) {
        int temp = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                temp++;
            }
        }
        System.out.println(temp);
    }
}

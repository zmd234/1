package day01;


public class Demo04return {
    public static void main(String[] args) {
        int num = getSum1(10, 20);
        System.out.println(num);
        System.out.println("------------------");
        getSum(10,20);
    }

    public static int getSum1(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void getSum(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }
}

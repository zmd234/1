package day01;

public class demo01 {
    public static void main(String[] args) {
        printNethod();
    }

    public static void printNethod() {
        for (int i =0; i < 5; i++){
            for (int j = 0; j < 20; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

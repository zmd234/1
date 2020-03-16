package day01;

/*
 * 有参数：小括号当中有内容，当一个方法需要一些数据条件，才能完成任务的时候就是有参数。
 *       例如两个数字相加，必须知道两个数字各自是多少，才能相加。
 * 无参数：小括号中留空，一个方法不需要任何数据条件，自己就能独立完成任务，就是无参数
 */
public class Demo03aram {
    public static void main(String[] args) {
        nethod1(10, 20);
        nethod2();
    }

    public static void nethod1(int a, int b) {
        int result = a + b;
        System.out.println("结果是：" + result);
    }

    public static void nethod2() {
        for (int i = 1; i < 20; i++) {
            System.out.println("哈哈" + i);
        }
    }
}

package day03;

/*
 * 方法的重载（overload），多个方法的名称一样，但是参数列表不一样
 * 好处：只需要记住唯一一个方法名称，就可以实现类似的多个功能
 *
 * 方法重载与下列相关
 * 1.参数的个数不同
 * 2.参数类型不同
 * 3.参数的多类型顺序不同
 *
 * 方法重载与下列无关
 * 1.与参数的名称无关
 * 2.与方法的返回值类型无关
 */
public class Demo01 {

    public static void main(String[] args) {
        /*System.out.println(sumOne(10,20));
        System.out.println( sumTwo(10,20,30));*/
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20,30));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}

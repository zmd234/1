package day04;

/*
 *静态初始化（指定内容），在创建数组的时候，不直接直接指定数据个数的多少，
 *                      而是直接将具体数据内容进行指定
 *
 * 静态初始化基本格式：
 * 数据类型[] 数据名称 = new 数据类型 [] { 元素1, 元素2, ...}
 */
public class Demo02 {

    public static void main(String[] args) {
        int[] arrayA = new int[]{5, 10, 20};

        String[] arrayB = new String[]{"Hello", "a"};
    }
}

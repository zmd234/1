package day06;

/*
 *定义一个类
 *属性
 *行为
 *
 * 对应到java中
 *
 * 成员变量（属性）：
 * String name;
 * int age;
 * 成员属性（行为）：
 * public void eat()
 *
 * 注意事项：
 * 1.成员变量是直接定义在类当中的，在方法外边。
 * 2.成员方法不要写static关键字。
 */
public class Student {

    //成员变量
    String name;
    int age;

    //成员方法
    public void eat() {
        System.out.println("吃饭饭");
    }

    public void sleep() {
        System.out.println("睡觉觉");
    }

    public void study() {
        System.out.println("学习");
    }
}

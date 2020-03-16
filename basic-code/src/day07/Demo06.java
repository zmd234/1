package day07;

public class Demo06 {

    public static void main(String[] args) {
        Person[] array = new Person[3];

        Person one = new Person("张三", 13);
        Person two = new Person("李四", 24);
        Person three = new Person("王五", 35);

        array[0] = one;
        array[1] = two;
        array[2] = three;

        for (int i = 0; i < 3; i++) {
            System.out.println("我叫" + array[i].getName() + ",今年" + array[i].getAge() + "岁。");

        }

    }
}

package day07;

import java.util.ArrayList;

public class Demo08 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("一");
        list.add("二");
        list.add("三");
        list.add("四");
        System.out.println(list);
        System.out.println(list.get(1));
        String name = list.remove(3);
        System.out.println(name);
        System.out.println(list);
        int num = list.size();
        System.out.println(num);
    }
}

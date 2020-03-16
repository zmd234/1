package ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main03 {
    /*
     * 1.要创建一个数n
     * 2.创建一个for循环来输入身份证
     * 3.一个if语句来判断
     * 4.根据substring来输出年月日
     * 5.转换为数字来进行比较用Arraylist集合存储
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        ArrayList<String> list = new ArrayList();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Integer.valueOf(list.get(i).substring(6, 10)) > Integer.valueOf(list.get(j).substring(6, 10))) {
                    String item = list.get(i);
                    list.remove(i);
                    list.add(i, list.get(j-1));
                    list.remove(j);
                    list.add(j, item);
                }else if (Integer.valueOf(list.get(i).substring(6, 10)) == Integer.valueOf(list.get(j).substring(6, 10))){
                    if (Integer.valueOf(list.get(i).substring(10, 12)) > Integer.valueOf(list.get(j).substring(10, 12))){
                        String item = list.get(i);
                        list.remove(i);
                        list.add(i, list.get(j-1));
                        list.remove(j);
                        list.add(j, item);
                    }else if (Integer.valueOf(list.get(i).substring(10, 12)) == Integer.valueOf(list.get(j).substring(10, 12))){
                        if (Integer.valueOf(list.get(i).substring(12, 14)) > Integer.valueOf(list.get(j).substring(12, 14))){
                            String item = list.get(i);
                            list.remove(i);
                            list.add(i, list.get(j-1));
                            list.remove(j);
                            list.add(j, item);
                        }
                    }
                }
            }
        }
        while (true) {
            String str = sc.nextLine();
            if (str.equals("sort1")) {
                for (int i = 0; i < n; i++) {
                    System.out.println(list.get(i).substring(6, 10) + "-" + list.get(i).substring(10, 12) + "-" + list.get(i).substring(12, 14));
                }
            } else if (str.equals("sort2")) {
                for (int i = 0; i < n; i++) {
                    System.out.println(list.get(i));
                }
            } else {
                System.out.println("exit");
            }
        }
    }
}
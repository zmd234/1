package ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> strlist = new ArrayList<>();
        while (true) {
            String s = sc.next();
            if (s.equals("!!end!!")) {
                break;
            } else {
                strlist.add(s);

            }
        }
        strlist.add(0, "begin");
        strlist.add("end");
        System.out.println(strlist);
        String str = sc.next();
        System.out.println(strlist.contains(str));
        System.out.println(strlist.indexOf(str));
        System.out.println(strlist.lastIndexOf(str));
        System.out.println(strlist.remove(0));
        System.out.println(strlist);
        str = sc.next();
        strlist.set(1, str);
        System.out.println(strlist);
        ArrayList<String> strlist1 = new ArrayList<>();
        str = sc.next();
        sc.close();
        for (int i = 0; i < strlist.size(); i++) {
            if (strlist.get(i).contains(str)) {
                strlist1.add(strlist.get(i));
            }
        }
        System.out.println(strlist1);
        strlist.remove(str);
        System.out.println(strlist);
        strlist.clear();
        System.out.print(strlist + "," + strlist.size() + "," + strlist.isEmpty());
    }
}
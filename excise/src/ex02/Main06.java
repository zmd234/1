package ex02;

import java.util.Scanner;
enum Grade {
    A, B, C, D, E;

    public Grade getGrade(int score) {
        int s = score / 10;
        Grade g;
        switch (s) {
            case 10:
            case 9:
                System.out.println("Excellent");
                g = Enum.valueOf(Grade.class, "A");
                break;
            case 8:
                System.out.println("Good");
                g = Enum.valueOf(Grade.class, "B");
                break;
            case 7:
                System.out.println("Average");
                g = Enum.valueOf(Grade.class, "C");
                break;
            case 6:
                System.out.println("Fair");
                g = Enum.valueOf(Grade.class, "D");
                break;
            default:
                g = Enum.valueOf(Grade.class, "E");
                System.out.println("Poor");
        }
        return g;
    }

}
public class Main06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();
            if(str.equals("")){
                break;
            }else{
                Grade g = Enum.valueOf(Grade.class, "A");
                g = g.getGrade(Integer.parseInt(str));
                printGradeInfo(g);
            }
        }
    }

    public static void printGradeInfo(Grade grade) {
        System.out.println("class name=" + Grade.class);
        System.out.println("grade value=" + grade);
    }
}
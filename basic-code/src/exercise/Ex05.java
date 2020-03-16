package exercise;

        import java.util.Scanner;

public class Ex05 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String item = sc.nextLine();
            if (item.isEmpty()){
                continue;
            }
            System.out.println("choice=" + item);
            switch (item) {
                case "double":
                    System.out.printf("%-5.2f,%5.2f,%.2f\n", sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
                    break;
                case "int":
                    int[] num = new int[3];
                    int sum = 0;
                    for (int i = 0; i < 3; i++) {
                        num[i] = sc.nextInt();
                        sum += num[i];
                    }
                    System.out.println(sum);
                    break;
                case "str":
                    String[] s = new String[3];
                    for (int i = 0; i < 3; i++) {
                        s[i] = sc.next();
                    }
                    for (int i = 2; i >= 0; i--) {
                        char[] a = s[i].toCharArray();
                        for (int j = 0; j < s[i].length(); j++) {
                            System.out.print(a[j]);
                        }
                    }
                    System.out.println();
                    break;
                case "line":
                    String str = new String();
                    str = sc.next();
                    System.out.println(str.toUpperCase());
                    break;
                default:
                    System.out.println("other");
                    break;
            }
        }
    }
}
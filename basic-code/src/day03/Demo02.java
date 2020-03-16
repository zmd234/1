package day03;

public class Demo02 {

    public static void main(String[] args) {
        byte a =10;
        byte b =20;
        System.out.println(isSame(a,b));
        System.out.println(isSame((short)a,(short)b));
        System.out.println(isSame(11,12));
        System.out.println(isSame((long)a,(long)b));
    }
    public static boolean isSame(byte a, byte b){
        System.out.println("两个byte参数方法执行");
        return a == b;
    }

    public static boolean isSame(short a, short b){
        System.out.println("两个short参数方法执行");
        return a == b;
    }

    public static boolean isSame(int a, int b){
        System.out.println("两个int参数方法执行");
        return a == b;
    }

    public static boolean isSame(long a, long b){
        System.out.println("两个long参数方法执行");
        return a == b;
    }
}

package day01;
/*
* 参数：就是进入方法的数据。
* 返回值：就是从方法中出来的数据。
*
*  定义方法的完整格式：
* 修饰符 返回值类型 方法名称（参数类型 参数名称，...）{
*   方法体
*   return 返回值；
* }
* 修饰符：现阶段的固定写法，public static
* 返回值类型
* 方法名称：方法的名字：规则和变量一样，小驼峰
* 参数类型：进入方法的具体数据是什么类型
* 参数名称：进入方法数据对应的变量名称
* 方法体：方法需要做的事情，若干行代码
* return：两个作用，第一停止当前方法，第二将后面的返回值还个调用处
* 返回值：也就是方法执行后最终产生的数据结果
*
* 方法的三种调用格式：
* 1.单独调用.   方法名称（参数）；
* 2.打印调用.   System.out.println(方法名称（参数）);
* 3.赋值调用.   数据类型 变量名称 = 方法名称（参数）；
* 注意事项：此前学习的方法，返回值规定类型位void，这种方法只能单独调用，不能进行打印调用或者赋值调用
*/
public class Demo02Define {
    public static void main(String[] args) {
        sum(10,20);
        System.out.println(sum(10,30));
        System.out.println("----------------");
        System.out.println(sum(10,40));
        System.out.println("----------------");
        int result = sum(10,100);
        result +=1000;
        System.out.println(result);
    }

    public static int sum(int a,int b) {
        int result = a + b;
        return result;
    }
}

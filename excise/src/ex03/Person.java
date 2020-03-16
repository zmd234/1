package ex03;

class Person{
    static {
        System.out.println("This is static initialization block");
    }

    private String name = null;
    private boolean gender = false;
    private int age = 0;
    private int id;
    private static int num = 0;

    public Person() {
        System.out.println("This is initialization block, id is " + num);
        System.out.println("This is constructor");
        id = num;
        System.out.println(name+","+age+","+gender+","+id);
        System.out.println(toString());
    }

    public Person(String name, int age, boolean gender) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        id = num;
        num++;
    }

    @Override
    public String toString() {
        return "Person [" +
                "name=" + name +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ']';
    }
}
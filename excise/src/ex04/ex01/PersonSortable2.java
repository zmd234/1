package ex04.ex01;

public class PersonSortable2 {
    private String name;
    private int age;

    public PersonSortable2() {
    }

    public PersonSortable2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + '-' + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

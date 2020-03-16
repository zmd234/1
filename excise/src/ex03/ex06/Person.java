package ex03.ex06;

import java.util.Objects;

public abstract class Person {
    private String name, sign;
    private int age;
    private boolean gender;

    public Person() {
    }

    public Person(String sign,String name, int age, boolean gender) {
        this.sign = sign;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + "-" +
                        age + "-" +
                        gender
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                gender == person.gender &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }
}

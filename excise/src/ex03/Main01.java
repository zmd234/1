package ex03;

import java.util.Scanner;

public class Main01 {

    public static class Person {
        private String name = null;
        private int age = 0;
        private boolean gender = false;
        private int id = 0;

        public Person() {
            System.out.println("This is constructor");
            System.out.println(name + "," + age + "," + gender + "," + id);
            System.out.println("Person [name=" + name + ", age=" + age + ", gender=" + gender + ", id=" + id + "]");
        }

        public Person(String name, int age, boolean gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String toString() {
            System.out.println("Person [name="+this.name+", age="+this.age+", gender="+this.gender+", id="+0+"]");
            return name;
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

        public boolean isGender() {
            return gender;
        }

        public void setGender(boolean gender) {
            this.gender = gender;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] per = new Person[n];
        for (int i = 0; i < n; i++) {
            per[i] = new Person(sc.next(),sc.nextInt(),sc.nextBoolean());
        }
        for (int i = n-1; i >= 0; i--) {
            per[i].toString();
        }
        //per.toString();
        Person person = new Person();
    }
}

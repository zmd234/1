package ex03.ex06;

import java.util.Objects;

public class Student extends Person {
    private String stuNo;
    private String clazz;

    public Student(String sign, String name, int age, boolean gender, String stuNo, String clazz) {
        super(sign, name, age, gender);
        this.stuNo = stuNo;
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return super.toString() + "-" +
                stuNo + "-" +
                clazz
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            if (!super.equals(o)) return false;
            Student student = (Student) o;
            return Objects.equals(stuNo, student.stuNo) &&
                    Objects.equals(clazz, student.clazz);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), stuNo, clazz);
    }
}

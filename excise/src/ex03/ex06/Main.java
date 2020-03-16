package ex03.ex06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Person> people = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String sign, name, stuNo, clazz,str,companyname;
        int age;
        boolean gender;
        double salary;
        while (true){
            sign = sc.next();
            if(sign.compareTo("s")==0){
                name = sc.next();
                age = sc.nextInt();
                gender = sc.nextBoolean();
                stuNo = sc.next();
                clazz = sc.next();
                Student student = new Student(sign, name, age, gender, stuNo, clazz);
                people.add(student);
            }else if(sign.compareTo("e")==0){
                name = sc.next();
                age = sc.nextInt();
                gender = sc.nextBoolean();
                salary = sc.nextDouble();
                companyname = sc.next();
                Company company = new Company(companyname);
                Employee employee = new Employee(sign, name, age, gender, salary, company);
                people.add(employee);
            }else{
                people.sort(Comparator.comparing(Person::getName).thenComparingInt(Person::getAge));
                for (int i = 0; i < people.size(); i++) {
                    if(people.get(i).getSign().compareTo("s")==0){
                        System.out.println("Student:" + people.get(i).toString());
                        int flag = 0;
                        for (int j = 0; j < students.size(); j++) {
                            if(students.get(j).equals(people.get(i))){
                                flag = 1;
                                break;
                            }
                        }
                        if (flag==0){
                            students.add((Student)people.get(i));
                        }
                    }else if (people.get(i).getSign().compareTo("e")==0){
                        System.out.println("Employee:" + people.get(i).toString());
                        int flag = 0;
                        for (int j = 0; j < employees.size(); j++) {
                            if (employees.get(j).equals(people.get(i))){
                                flag = 1;
                                break;
                            }
                        }
                        if(flag==0){
                            employees.add((Employee) people.get(i));
                        }
                    }
                }
                str = sc.next();
                if(str.compareTo("exit") == 0 || str.compareTo("return") == 0)
                    return;
                System.out.println("stuList");
                for (int i = 0; i < students.size(); i++) {
                    System.out.println("Student:" + students.get(i).toString());
                }
                System.out.println("empList");
                for (int i = 0; i < employees.size(); i++) {
                    System.out.println("Employee:" + employees.get(i).toString());
                }
            }
        }
    }
}

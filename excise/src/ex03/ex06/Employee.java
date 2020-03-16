package ex03.ex06;

import java.text.DecimalFormat;
import java.util.Objects;

public class Employee extends Person {
    private double salary;
    private Company company;

    public Employee() {
    }

    public Employee(String sign, String name, int age, boolean gender, double salary, Company company) {
        super(sign, name, age, gender);
        this.salary = salary;
        this.company = company;
    }

    @Override
    public String toString() {
        return super.toString() + "-" + company.toString() + "-" + salary;
    }


    @Override
    public boolean equals(Object obj) {
        if(super.equals(obj)) {		//首先调用父类的equals方法,如果返回true。再比较company与salary。
            Employee per = (Employee)obj;
            if(this.company.toString() == null || per.company.toString() == null)
                return false;
            //比较salary属性时，使用DecimalFormat df = new DecimalFormat("#.#");保留1位小数
            String newpersalary = new DecimalFormat("#.#").format(per.salary);
            String newthissalary = new DecimalFormat("#.#").format(this.salary);
            return (per.company.toString().compareTo(this.company.toString()) == 0 && newpersalary.compareTo(newthissalary) == 0);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary, company);
    }
}

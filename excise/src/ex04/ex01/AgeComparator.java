package ex04.ex01;


import java.util.Comparator;

public class AgeComparator implements Comparator<PersonSortable2> {


    @Override
    public int compare(PersonSortable2 t, PersonSortable2 t1) {
       if(t.getAge()>t1.getAge()){
           return 1;
       }else if(t.getAge()<t1.getAge()){
           return -1;
       }else {
           return 0;
       }
    }
}

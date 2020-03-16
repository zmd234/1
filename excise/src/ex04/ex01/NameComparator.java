package ex04.ex01;

public class NameComparator implements  java.util.Comparator<PersonSortable2> {

    @Override
    public int compare(PersonSortable2 t, PersonSortable2 t1) {
        if(t.getName().compareTo(t1.getName())>0){
            return 1;
        }else if(t.getName().compareTo(t1.getName())<0){
            return  -1;
        }else{
            return 0;
        }
    }
}

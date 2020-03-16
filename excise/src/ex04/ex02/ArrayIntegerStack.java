package ex04.ex02;

import java.util.Arrays;

public class ArrayIntegerStack implements IntegerStack {
    private int a[];
    private int count;

    public ArrayIntegerStack(int num) {
        a = new int[num];
    }

    @Override
    public Integer push(Integer item) {
        if (item == null) {
            return null;
        }
        if (count == a.length) {
            return null;
        }
        a[count] = item;
        count++;
        return item;
    }

    @Override
    public Integer pop() {
        if(count==0) {
            return null;
        }
        count--;
        return a[count];
    }

    @Override
    public Integer peek() {
        if (count == 0) {
            return null;
        }
        return a[count - 1];
    }

    @Override
    public boolean empty() {
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public String toString() {
        String str = "";
        int i = 0;
        if (count == 0) {
            while (i < a.length - 1) {
                str += "null, ";
                i++;
            }
            str+="null";
        } else {
            if (count<a.length){
                for ( i = 0; i < count; i++) {
                    str+=a[i]+", ";
                }
                for (int j=count;j<a.length;j++){
                    if(j==a.length-1){
                        str+="null";
                    }else{
                        str+="null, ";
                    }
                }
            }else {
                for ( i = 0; i < count; i++) {
                    if(i==count-1){
                        str+=a[i];
                    }else {
                        str += a[i] + ", ";
                    }
                }
            }
        }
        return "["+str+"]";
    }
}

package hillel.arrandlist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static  <E> List<E> toList(E[] arr){
        List<E> list = new ArrayList<>();
        for (E i: arr) {
            list.add(i);
        }
        return list;
    }
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5};

        List<Integer>list = toList(array);

        System.out.println("List " + list);
        System.out.println("__________________________________________________________________________________________");

        Unique un = new Unique();
        List<Integer> integerList = new ArrayList<>();

        integerList.add(2);
        integerList.add(10);
        integerList.add(45);
        integerList.add(77);
        integerList.add(66);
        integerList.add(2178);
        integerList.add(8);
        integerList.add(32);
        integerList.add(9);
        
        System.out.println(integerList);
        System.out.println(un.findUnique((ArrayList<Integer>) integerList));
    }
}

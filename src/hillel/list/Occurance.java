package hillel.list;


import java.util.*;
import java.util.stream.Collectors;

public class Occurance {
    Scanner scr = new Scanner(System.in);

    public void countOccurance(ArrayList<String> list, String string) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Write a name to the list: ");
            String string1 = scr.next();
            list.add(string1);
            String str = list.get(i);

        }
        int count = Collections.frequency(list, string);
        System.out.println("Ready list: " + list);
        System.out.println("Number of identical elements " + string + " : " + String.valueOf(count));


    }

    public void findOccurance(ArrayList<String> list) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Write a name to the list: ");
            String string1 = scr.next();
            list.add(string1);
        }
        System.out.println(list);
        Collectors Collectors = null;
        Map<String, Integer> frequency = list.stream().collect(Collectors.toMap(e -> e, e -> 1,Integer::sum));
        frequency.forEach((k, v) -> System.out.println("name: " + k + " occurrence: " + v));
    }
}



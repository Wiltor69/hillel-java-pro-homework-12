package hillel.arrandlist;

import java.util.*;


public class Unique {
    public List <Integer>  findUnique(ArrayList<Integer> arrayList) {

        List <Integer> list =new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++)
            for (int j = 2; j < arrayList.get(i); j++)

                if (arrayList.get(i) % j == 0) {
                    break;
                } else
                    list.add(arrayList.get(i));


        return list;
    }
}

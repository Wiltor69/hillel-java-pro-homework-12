package hillel.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Occurance occurance=new Occurance();
        Scanner scr = new Scanner(System.in);
       System.out.println("Write a name for verification: ");
        String str = scr.next();
        occurance.countOccurance(new ArrayList<>(), str);
        System.out.println("-----------------------New chapter-----------------------------------");
        occurance.findOccurance(new ArrayList<>());
    }
}

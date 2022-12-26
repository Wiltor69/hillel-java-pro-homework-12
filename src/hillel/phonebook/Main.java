package hillel.phonebook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        WriteUsers wr = new WriteUsers("Petrov", "380444184567");
        WriteUsers wr1 = new WriteUsers("Slava", "380444189832");
        WriteUsers wr2 = new WriteUsers("Johnson", "380505337842");
        WriteUsers wr3 = new WriteUsers("Petrov", "380505354780");
        WriteUsers wr4 = new WriteUsers("Bill", "380673349891");
        WriteUsers wr5 = new WriteUsers("Henry", "380731701456");
        WriteUsers wr6 = new WriteUsers("Slava", "380505223470");
        List<WriteUsers> writeUsersList = new ArrayList<>();
        PhoneBook pb = new PhoneBook((ArrayList<WriteUsers>) writeUsersList);
        pb.add(wr);
        pb.add(wr1);
        pb.add(wr2);
        pb.add(wr3);
        pb.add(wr4);
        pb.add(wr5);
        pb.add(wr6);
        System.out.println(writeUsersList);
        System.out.println("Write one name please: ");
        String s = reader.readLine();
        pb.find(s);
        System.out.println("Write one name please: ");
        String s1 = reader.readLine();
        pb.find(s1);


    }
}

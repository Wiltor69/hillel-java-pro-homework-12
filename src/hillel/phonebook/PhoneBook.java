package hillel.phonebook;

import java.util.ArrayList;

public class PhoneBook {
    ArrayList<WriteUsers> writeUsersArrayList = new ArrayList<>();


    public PhoneBook(ArrayList<WriteUsers> writeUsersArrayList) {
        this.writeUsersArrayList = writeUsersArrayList;
    }

    public ArrayList<WriteUsers> getWriteUsersArrayList() {
        return writeUsersArrayList;
    }

    public void setWriteUsersArrayList(ArrayList<WriteUsers> writeUsersArrayList) {
        this.writeUsersArrayList = writeUsersArrayList;
    }


    public ArrayList<WriteUsers> add(WriteUsers writeUsers) {
        writeUsersArrayList.add(writeUsers);
        return writeUsersArrayList;
    }

    public void find(String findName) {
        if(writeUsersArrayList.isEmpty())
            System.out.println("List is null");
        for (WriteUsers i : writeUsersArrayList)
            if (i.getName().equals(findName) == true)
                 System.out.println(i.toString());

        }

}









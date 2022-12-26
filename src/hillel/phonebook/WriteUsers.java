package hillel.phonebook;

import java.util.Objects;

public class WriteUsers {
    private String name;
    private String telephoneNumber;

    public WriteUsers(String name, String telephoneNumber) {
        this.name = name;
        this.telephoneNumber = telephoneNumber;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WriteUsers that = (WriteUsers) o;
        return Objects.equals(name, that.name) && Objects.equals(telephoneNumber, that.telephoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, telephoneNumber);
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                '}';
    }
}

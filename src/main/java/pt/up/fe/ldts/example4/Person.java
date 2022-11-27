package pt.up.fe.ldts.example4;

public abstract class Person {
    protected String name;
    protected String phone;

    public Person(String name, String phone) {
       this.name = name;
       this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}

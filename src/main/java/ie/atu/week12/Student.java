package ie.atu.week12;

public class Student
{
    private String name;
    private int ID;
    private int age;
    private String address;

    public Student(String name, int ID, int age, String address)
    {
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.address = address;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student details: " +
                "name ='" + name + '\'' +
                ", ID =" + ID +
                ", age =" + age +
                ", address ='" + address;
    }
}

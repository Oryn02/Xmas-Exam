package ie.atu.exam;

public class Employee {
    private String name;
    private int PPS;
    private String Employment;
    private String Gender;
    private int age;

    public Employee() {
    }

    public Employee(String name, int PPS, String employment, String gender, int age) {
        this.name = name;
        this.PPS = PPS;
        Employment = employment;
        Gender = gender;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPPS() {
        return PPS;
    }

    public void setPPS(int PPS) {
            this.PPS = PPS;
    }

    public String getEmployment() {
        return Employment;
    }

    public void setEmployment(String employment) {
        Employment = employment;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return "Name = " + name + ", "+ "pps = " + PPS + ", " + "Employment type = " + Employment + ", " + "gender = " + Gender + ", " + "age = " + age ;
    }
}

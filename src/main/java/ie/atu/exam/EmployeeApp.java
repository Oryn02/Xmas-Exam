package ie.atu.exam;

public class EmployeeApp {
    public static void main(String[] args) {

        Employee one = new Employee();
        one.setName("bob");
        one.setAge(21);
        one.setPPS(1111111111);
        one.setEmployment("Full-time");
        one.setGender("man");

        System.out.println("details for employee one are: " + one.toString() + "\n");

        Employee two = new Employee();
        two.setName("billy");
        two.setAge(15);
        two.setPPS(111111);
        two.setEmployment("part-time");
        two.setGender("non binary");

        System.out.println("details for employee two are: " + two.toString() + "\n");

    }
}


package ie.atu.week12;

import java.util.Scanner;

public class StudentApp
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);


        System.out.println("Please enter your name");
        Student name = new Student();
        name.getName(input.next());
        System.out.println(name);


        System.out.println("Please enter your Student ID");
        Student ID = new Student();


        System.out.println("Please enter your age");
        Student age = new Student();


        System.out.println("Please enter your address");
        Student address = new Student();


    }
}

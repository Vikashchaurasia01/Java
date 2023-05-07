// package Inheritance;
//package Lab6;

// Write a program to create Teacher class and enter data through keyboard. 
// Create another class Student which extends Teacher class. Print teacher student information.

class Teacher{
    String name;
    String college;
    void setData(String name, String college){
        this.name = name;
        this.college = college;
    }
    String getData(){
        return "Name: " + name + " College: " + college;
    }
}

class Student extends Teacher{
    String department;
    int roll;
    void setData(String department, int roll){
        this.department = department;
        this.roll = roll;
    }
    String getData(){
        System.out.println("student department = "+department+" roll = "+roll);

        return "department "+department + " roll "+roll;
    }
}

public class TeacherStudent {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setData("Palash Ray","HIT");
        System.out.println("Teacher "+t.getData());

        Student s = new Student();
        s.setData("CSE",188);
        s.getData();
    }
}

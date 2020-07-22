package practice02;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    public String introduce(){
        return "My name is Tom. I am 18 years old. Coding for the glory of OOCL.";
    }
}

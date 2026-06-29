package javaapplication1;

class Student {
    String name;
    int age;
    
    Student() {
        name = "Mrunal Ghogare";
        age = 18;
    }
    Student(String n, int a) {
        name = n;
        age = a;
    }

   
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void display(String course) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    
    static void collegeName() {
        System.out.println("College: MVLU College");
    }
}

public class JavaApplication1 {

    public static void main(String[] args) {

        Student.collegeName();

        Student s1 = new Student();
        s1.display();

        System.out.println();

        Student s2 = new Student("Rupali", 20);
        s2.display("Computer Science");
    }
}
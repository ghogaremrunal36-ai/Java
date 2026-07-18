package javaapplication1;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}
class FailException extends Exception {
    public FailException(String message) {
        super(message);
    }
}
class Student {
    private String name;
    private int marks;

    
    public Student(String name) {
        this.name = name;
    }

    
    public void enterMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks should be between 0 and 100.");
        }

        this.marks = marks;
        System.out.println("Marks entered successfully: " + marks);
    }

   
    public void checkResult() throws FailException {
        if (marks < 35) {
            throw new FailException(name + " has failed.");
        }

        System.out.println(name + " has passed.");
    }

    
    public void display() {
        System.out.println("\nStudent Details");
        System.out.println("Name  : " + name);
        System.out.println("Marks : " + marks);
    }
}

public class StudentExceptionDemo {

    public static void main(String[] args) {

        Student student = new Student("Mrunal");

        try {
            student.enterMarks(80);      
            student.checkResult();       
        } catch (InvalidMarksException e) {
            System.out.println("Marks Error: " + e.getMessage());
        } catch (FailException e) {
            System.out.println("Result Error: " + e.getMessage());
        }

        try {
            student.enterMarks(120);     
        } catch (InvalidMarksException e) {
            System.out.println("Marks Error: " + e.getMessage());
        }

        student.display();
    }
}


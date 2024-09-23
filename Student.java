// Cat class definition
public class Student {

    // instance variables
    private String name;
    private int classes;
    private double grade;
    private int aps;
 
    // constructor
    public Student(String studentName, int classesTaking, double GPA, int apsTaken) {
        name = studentName;
        classes = classesTaking;
        grade = GPA;
        aps = apsTaken;
    }
 
    public void introduce() {
        System.out.println("Name: " + name);
        System.out.println("Classes currently taking: " + classes);
        System.out.println("GPA: " + grade);
        System.out.println("AP Credits: " + aps);
    }
    
    public void eligible() {
        if (grade < 65) {
            System.out.println("This student is NOT eligible to graduate.");
        } else {
            System.out.println("This student IS eligible to graduate.");
        }
        System.out.println();
    }


 }
 
 
 
 
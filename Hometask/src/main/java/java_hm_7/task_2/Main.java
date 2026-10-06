package java_hm_7.task_2;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
         List<Student> students = new ArrayList<>();
         Student.addStudents(students, new Student(1,"Sasha", 19,80));
         Student.addStudents(students, new Student(2,"Kyryll",22,88));
         Student.addStudents(students, new Student(3,"Tanya", 21,65));
         Student.addStudents(students, new Student(4,"Serhey", 24,78));
        System.out.println("All Student");
        Student.printAllStudents(students);
        System.out.println("Add new Student");
        Student.addStudents(students, new Student(5,"Polina",17,99));
        Student.printAllStudents(students);
        System.out.println("Find student");
        Student foundStudent = Student.findStudentByName(students, "Tanya");
        if (foundStudent != null){
            System.out.println("Found Student");
            System.out.println(foundStudent);
        }
        System.out.println("Delete student with id 2");
        Student.removeStudentById(students,3);
        Student.printAllStudents(students);
    }
}

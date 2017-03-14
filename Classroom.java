import java.util.ArrayList;

public class Classroom {
  private String name;

  private ArrayList<Student> studentsInClassroom =
    new ArrayList<Student>();

  // Constructor: No return type
  // Name = Class name
  public Classroom(String name) {
    this.name = name;
  }

  // public void addStudent2(String firstname, String lastname, String email) {
  //   Student student = new Student(firstname, lastname, email);
  //   studentsInClassroom.add(student);
  //   // this.studentsInClassroom.add(new Student(firstname, lastname, email));

  // }

  public void print() {
    // For each - Advanced for loop
    //   Type navn : collection
    for (Student student : studentsInClassroom) {
      System.out.println(student);
    }
  }

  public void addStudent(Student s) {
    studentsInClassroom.add(s);

    // To get an object from an ArrayList
    // Student s1 = studentsInClassroom.get(1);
  }
}























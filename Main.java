public class Main {
  public static void main(String[] args) {
    Student s1 = new Student("Alpay", "The executioner Hopkins");
    Student s2 = new Student("Tobias", "Money Mayweather");
    Student s3 = new Student("Silas", "Captain hook - Jones Jr.");

    Classroom cl1 = new Classroom("Dat17v1");
    cl1.addStudent(s1);
    cl1.addStudent(s2);
    cl1.addStudent(s3);

    cl1.print(); 
    
  }
}